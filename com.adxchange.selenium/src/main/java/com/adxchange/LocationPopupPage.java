package com.adxchange;

import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;

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

    @FindBy(how = How.ID, using = "zipCode")
    private WebElement zipCodeEl;

    @FindBy(how = How.ID, using = "go")
    private WebElement changeLocationBtnEl;

    @FindBy(how = How.CLASS_NAME, using = "changeLocationLink")
    private WebElement changeLocationLinkL1;

    @FindBy(how = How.ID, using = "addressChange")
    private WebElement addressChangeAC1;

    @FindBy(how = How.CLASS_NAME, using = "close")
    private WebElement closeWindow1;

    public LocationPopupPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void changeLocation1(String state, String city) {
        changeLocationLinkL1.click();
        Select clickThisState = new Select(stateChangeLocEl);
        clickThisState.selectByValue(state);
        Select clickThisCity = new Select(cityChangeLocEl);
        clickThisCity.selectByValue(city);
        changeLocationBtnEl.click();
    }

    public void changeLocation2(String zipCode) {
        changeLocationLinkL1.click();
        zipCodeEl.sendKeys(zipCode);
        addressChangeAC1.click();
        changeLocationBtnEl.click();
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
