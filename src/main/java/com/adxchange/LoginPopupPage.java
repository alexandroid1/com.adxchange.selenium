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

    @FindBy(how = How.ID, using = "loginPopUpButtonHeader")
    private WebElement postYourAdBtnB3;

    @FindBy(how = How.ID, using = "userNameNotLogged")
    private WebElement userNameNotLoggedInputI1;

    @FindBy(how = How.ID, using = "userNameLogged")
    private WebElement userNameLoggedInputI2;

    @FindBy(how = How.ID, using = "passWordNotLogged")
    private WebElement passWordNotLoggedInputI1;

    @FindBy(how = How.ID, using = "passWordLogged")
    private WebElement passWordLoggedInputI2;

    @FindBy(how = How.ID, using = "loginButtonAreaButton")
    private WebElement loginSubmitBtnB2;

    public LoginPopupPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void whenIChangeUsernamePasswordByPostYourAdClicking(String username, String password){
        postYourAdBtnB3.click();
        userNameNotLoggedInputI1.sendKeys(username);
        passWordNotLoggedInputI1.sendKeys(password);
        loginSubmitBtnB2.click();
    }
}
