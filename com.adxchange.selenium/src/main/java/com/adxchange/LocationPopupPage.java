package com.adxchange;

import com.adxchange.steps.BasicWebSteps;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

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

    public LocationPopupPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void changeLocation(String state, String city) {

       // FirefoxDriver driver = new FirefoxDriver();

        WebDriver driver = BasicWebSteps.driver;

        /*stateChangeLocEl.sendKeys(state);*/
        WebElement dropDownListBoxForState = driver.findElement(By.id("stateChangeLoc"));
        Select clickThisState = new Select(dropDownListBoxForState);
        clickThisState.selectByValue(state);

        /*cityChangeLocEl.sendKeys(city);*/
        WebElement dropDownListBoxForCity = driver.findElement(By.id("cityChangeLoc"));
        Select clickThisCity = new Select(dropDownListBoxForCity);
        clickThisCity.selectByValue(city);

        changeLocationBtnEl.click();
    }

    public void changeLocationWithZIP(String zipCode) {
        zipCodeEl.sendKeys(zipCode);
        changeLocationBtnEl.click();
    }
}
