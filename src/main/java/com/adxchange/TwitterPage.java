package com.adxchange;

import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by ALEX on 06.09.2015.
 */
public class TwitterPage extends AbstractPage {

    @FindBy(how = How.ID, using = "signUp")
    private WebElement signUpBtnB1;

    @FindBy(how = How.ID, using = "twitterIdImg")
    private WebElement twitterIdImgBtnB2;

    @FindBy(how = How.ID, using = "username_or_email")
    private WebElement userNameInputI1;

    @FindBy(how = How.ID, using = "password")
    private WebElement passwordInputI2;

    @FindBy(how = How.ID, using = "allow")
    private WebElement allowButtonBtnB3;

    public TwitterPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void whenILoginToSiteByTwitter(String username, String password){
        signUpBtnB1.click();
        twitterIdImgBtnB2.click();
        userNameInputI1.sendKeys(username);
        passwordInputI2.sendKeys(password);
        allowButtonBtnB3.click();


    }




}
