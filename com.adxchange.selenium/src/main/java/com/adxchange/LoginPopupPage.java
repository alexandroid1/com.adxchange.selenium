package com.adxchange;

import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by ALEX on 10.08.2015.
 */
public class LoginPopupPage extends AbstractPage {

    @FindBy(how = How.ID, using = "logging")
    private WebElement loggingBtnB1;

    @FindBy(how = How.CLASS_NAME, using = "login_popUpButton")
    private WebElement postYourAdBtnB3;

    @FindBy(how = How.NAME, using = "username")
    private WebElement usernameInputI1;

    @FindBy(how = How.NAME, using = "password")
    private WebElement passwordInputI2;

    @FindBy(how = How.CLASS_NAME, using = "login_buttonarea_button")
    private WebElement loginSubmitBtnB2;

    public LoginPopupPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void whenIChangeUsernamePasswordByPostYourAdClicking(String username, String password){
        postYourAdBtnB3.click();
        usernameInputI1.sendKeys(username);
        passwordInputI2.sendKeys(password);
        loginSubmitBtnB2.click();
    }

}
