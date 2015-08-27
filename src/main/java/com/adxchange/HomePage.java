package com.adxchange;

import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
    @FindBy(how = How.ID, using = "quickSearchKeywords")
    private WebElement quickSearchKeywordsEl;
    
    @FindBy(how = How.ID, using = "searching")
    private WebElement quickSearchButtonEl;

    @FindBy(how = How.CLASS_NAME, using = "changeLocationLink")
    private WebElement changeLocationLink;

    @FindBy(how = How.ID, using = "locationContainer")
    private WebElement locationContainerC1;

    @FindBy(how = How.ID, using = "welcomeBack")
    private WebElement welcomeBackWB1;

    public HomePage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void open() {
        // "https://tsuser:QM7yams@www.theadxchange.com/?gws_rd=ssl"
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

    public void verifySelectedLocationByStateCity(String state, String city) {
        WebDriver driver = getDriverProvider().get();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.textToBePresentInElement(locationContainerC1,city + ", " + state));
        assertEquals(city + ", " + state, locationContainerC1.getText());
    }

    public void verifyWelcomeBack(String firstName, String lastName){
        assertEquals("Welcome back" + firstName + " " + lastName, welcomeBackWB1.getText());
    }

}
