package com.adxchange;

import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.concurrent.TimeUnit;

/**
 * Created by IntelliJ IDEA.
 *
 * @author <a href="mailto:vzhovtiuk@gmail.com">Vitaliy Zhovtyuk</a>
 *         Date: 7/28/15
 *         Time: 5:37 PM
 */
public class LocationPopupPage extends AbstractPage {
    @FindBy(how = How.NAME, using = "stateChangeLoc")
    private WebElement stateChangeLocEl;

    @FindBy(how = How.NAME, using = "cityChangeLoc")
    private WebElement cityChangeLocEl;

    @FindBy(how = How.ID, using = "go")
    private WebElement changeLocationBtnEl;

    public LocationPopupPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void open() {
        get("http://tsuser:QM7yams@www.theadxchange.com");
        manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void changeLocation(String state, String city) {
        stateChangeLocEl.sendKeys(state);
        cityChangeLocEl.sendKeys(city);
        changeLocationBtnEl.click();
    }
}
