package com.adxchange;

import org.jbehave.web.selenium.WebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

/**
 * Created by IntelliJ IDEA.
 *
 * @author <a href="mailto:vzhovtiuk@gmail.com">Vitaliy Zhovtyuk</a>
 *         Date: 7/28/15
 *         Time: 5:38 PM
 */
public abstract class AbstractPage extends WebDriverPage {
    public AbstractPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void found(String text) {
        found(getPageSource(), text);
    }

    public void found(String pageSource, String text) {
        if (!pageSource.contains(escapeHtml(text))) {
            fail("Text: '" + text + "' not found in page '" + pageSource + "'");
        }
    }

    public void found(List<String> texts) {
        for (String text : texts) {
            found(text);
        }
    }

    public void notFound(String text) {
        notFound(getPageSource(), text);
    }

    public void notFound(String pageSource, String text) {
        assertThat(pageSource.contains(escapeHtml(text)), is(false));
    }

    private String escapeHtml(String text) {
        return text.replace("<", "&lt;").replace(">", "&gt;");
    }

    
}
