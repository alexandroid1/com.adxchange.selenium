package com.adxchange;

import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;
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

    @FindBy(how = How.ID, using = "welcomeBack")
    private WebElement welcomeBackWB1;

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

    public void verifySelectedLocationByStateCity(String state, String city) {
        assertEquals(city + ", " + state, locationContainerC1.getText());
    }

    public void verifyWelcomeBack(String firstName, String lastName){
        assertEquals("Welcome back" + firstName + " " + lastName, welcomeBackWB1.getText());
    }

    public void whenIChangeLocationToFakeLocation(String locationFileName){
        URL firefoxProfileFolderURL = HomePage.class.getResource("/firefoxProfile/" + "firefoxProfileFolder.txt");
        URL locationFile = HomePage.class.getResource("/location/" + locationFileName);
        String firefoxProfileFolderStr = "";
        Scanner in = null;
        try {
            in = new Scanner(new File(firefoxProfileFolderURL.toURI()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        while(in.hasNext())
            firefoxProfileFolderStr += in.nextLine();
        in.close();
        File firefoxProfileFolder = new File(firefoxProfileFolderStr);
        FirefoxProfile profile = new FirefoxProfile(firefoxProfileFolder);
        profile.setPreference("geo.prompt.testing",true);
        profile.setPreference("geo.prompt.testing.allow", true);
        try {
            profile.setPreference("geo.wifi.uri", String.valueOf(locationFile.toURI()));
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        WebDriver driver = new FirefoxDriver(profile);
        // "http://tsuser:QM7yams@www.theadxchange.com"
        driver.navigate().to(System.getProperty("qaHost"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
