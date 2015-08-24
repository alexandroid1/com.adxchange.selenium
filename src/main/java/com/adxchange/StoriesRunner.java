package com.adxchange;

import com.adxchange.steps.BasicWebSteps;
import com.google.common.util.concurrent.MoreExecutors;
import org.jbehave.core.Embeddable;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.embedder.Embedder;
import org.jbehave.core.embedder.executors.SameThreadExecutors;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.jbehave.core.steps.SilentStepMonitor;
import org.jbehave.web.selenium.ContextView;
import org.jbehave.web.selenium.FirefoxWebDriverProvider;
import org.jbehave.web.selenium.LocalFrameContextView;
import org.jbehave.web.selenium.PerStoriesWebDriverSteps;
import org.jbehave.web.selenium.PropertyWebDriverProvider;
import org.jbehave.web.selenium.SeleniumConfiguration;
import org.jbehave.web.selenium.SeleniumContext;
import org.jbehave.web.selenium.SeleniumStepMonitor;
import org.jbehave.web.selenium.WebDriverProvider;
import org.jbehave.web.selenium.WebDriverScreenshotOnFailure;
import org.jbehave.web.selenium.WebDriverSteps;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.util.List;

import static org.jbehave.core.io.CodeLocations.codeLocationFromClass;
import static org.jbehave.core.reporters.Format.CONSOLE;
import static org.jbehave.core.reporters.Format.TXT;

/**
 * <p>
 * {@link Embeddable} class to run multiple textual stories via JUnit.
 * </p>
 * <p>
 * Stories are specified in classpath and correspondingly the {@link LoadFromClasspath} story loader is configured.
 * </p> 
 */
public class StoriesRunner extends JUnitStories {
    private WebDriverProvider driverProvider = new FirefoxWebDriverProvider();
    private WebDriverSteps lifecycleSteps = new PerStoriesWebDriverSteps(driverProvider);
    private SeleniumContext context = new SeleniumContext();
    private ContextView contextView = new LocalFrameContextView().sized(500, 100);
    private Pages pages = new Pages(driverProvider);


    public StoriesRunner() {
        if ( lifecycleSteps instanceof PerStoriesWebDriverSteps ){
            configuredEmbedder().useExecutorService(MoreExecutors.sameThreadExecutor());
        }
    }

    @Override
    public Configuration configuration() {
        Class<? extends Embeddable> embeddableClass = this.getClass();
        return new SeleniumConfiguration()
                .useSeleniumContext(context)
                .useWebDriverProvider(driverProvider)
                .useStepMonitor(new SeleniumStepMonitor(contextView, context, new SilentStepMonitor()))
                .useStoryLoader(new LoadFromClasspath(embeddableClass))
                .useStoryReporterBuilder(new StoryReporterBuilder()
                        .withCodeLocation(codeLocationFromClass(embeddableClass))
                        .withDefaultFormats()
                        .withFormats(CONSOLE, TXT));
    }

    @Override
    protected List<String> storyPaths() {
        return new StoryFinder().findPaths(codeLocationFromClass(this.getClass()), "**/*.story", "**/excluded*.story");
                
    }

    @Override
    public InjectableStepsFactory stepsFactory() {
        Configuration configuration = configuration();
        return new InstanceStepsFactory(configuration,
                new BasicWebSteps(pages),
                lifecycleSteps,
                new WebDriverScreenshotOnFailure(driverProvider, configuration.storyReporterBuilder()));
    }
}