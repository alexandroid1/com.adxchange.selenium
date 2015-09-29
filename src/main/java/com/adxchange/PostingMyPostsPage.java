package com.adxchange;

import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

/**
 * Created by ALEX on 18.08.2015.
 */
public class PostingMyPostsPage extends AbstractPage  {

    @FindBy(how = How.ID, using = "welcomeBack")
    private WebElement welcomeBackBtnB1;

    @FindBy(how = How.XPATH, using = ".//table/tbody/tr[3]/td[2]/a")
    private WebElement adNameLinkL1;

    public PostingMyPostsPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void verifyAdName(){
        WebDriver driver = getDriverProvider().get();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.textToBePresentInElement(adNameLinkL1, Pages.postTitleRandomString));
        assertEquals(Pages.postTitleRandomString, adNameLinkL1.getText());
    }

    public void verifyWelcomeBackAsFirstNameLastName(String firstName, String lastName){
        WebDriver driver = getDriverProvider().get();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.textToBePresentInElement(welcomeBackBtnB1, firstName + " " + lastName));
        assertEquals("Welcome back " + firstName + " " + lastName, welcomeBackBtnB1.getText());
    }
}
