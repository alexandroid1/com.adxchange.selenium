package com.adxchange;

import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

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

    @FindBy(how = How.CLASS_NAME, using = "locationContainer")
    private WebElement locationContainer;


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

    public void verifySelectedLocation(String state, String city) {
        assertEquals(city + ", " + state, locationContainer.getText());
    }
}
