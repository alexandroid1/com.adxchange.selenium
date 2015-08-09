package com.adxchange;

import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 *
 * @author <a href="mailto:vzhovtiuk@gmail.com">Vitaliy Zhovtyuk</a>
 *         Date: 7/28/15
 *         Time: 5:37 PM
 */
public class HomePage extends AbstractPage {
    @FindBy(how = How.NAME, using = "quickSearchKeywords")
    private WebElement quickSearchKeywordsEl;
    
    @FindBy(how = How.ID, using = "searching")
    private WebElement quickSearchButtonEl;

    @FindBy(how = How.CLASS_NAME, using = "changeLocationLink")
    private WebElement changeLocationLink;

    @FindBy(how = How.ID, using = "locationContainer")
    private WebElement locationContainerC1;

    @FindBy(how = How.ID, using = "locationContainer")
    private WebElement locationContainerC2;

    @FindBy(how = How.NAME, using = "stateChangeLoc")
    private WebElement stateChangeLocEl;

    @FindBy(how = How.NAME, using = "cityChangeLoc")
    private WebElement cityChangeLocEl;

    public HomePage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void open() {
        // "http://tsuser:QM7yams@www.theadxchange.com"
        get(System.getProperty("qaHost"));
        manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void openLocationPopup() {
        changeLocationLink.click();
    }

    public void search(String keyword) {
        quickSearchKeywordsEl.sendKeys(keyword);
        changeLocationLink.click();
    }

    public void verifySelectedLocation1(String state, String city) {
        assertEquals(city + ", " + state, locationContainerC1.getText());
    }

    public void verifySelectedLocation2(String state, String city) {
       // assertEquals(city + ", " + state, locationContainerC2.getText());
        Select clickThisState = new Select(stateChangeLocEl);
        clickThisState.getFirstSelectedOption().getText();
        assertEquals(state, clickThisState.getFirstSelectedOption().getText());

        Select clickThisCity = new Select(cityChangeLocEl);
        clickThisCity.getFirstSelectedOption().getText();
        assertEquals(city, clickThisCity.getFirstSelectedOption().getText());

      /*  assertEquals(city, cityChangeLocEl.getText());*/

    }
}
