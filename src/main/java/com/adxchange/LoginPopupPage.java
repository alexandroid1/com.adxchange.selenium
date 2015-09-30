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
 * Created by ALEX on 10.08.2015.
 */
public class LoginPopupPage extends AbstractPage {

    /*-------for login story----------*/

    @FindBy(how = How.ID, using = "signUp")
    private WebElement signUpBtnB1;

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

    @FindBy(how = How.ID, using = "clickHere")
    private WebElement clickHereLinkL1;


    public LoginPopupPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void clickSignupButton(){
        signUpBtnB1.click();
    }

    public void clickPostYourAdButton(){
        postYourAdBtnB3.click();
    }

    public void changeUsernamePassword(String username, String password){
        userNameNotLoggedInputI1.sendKeys(username);
        passWordNotLoggedInputI1.sendKeys(password);
    }

    public void clickLoginButton(){
        loginSubmitBtnB2.click();
    }

/*    public void changeUsernamePasswordByPostYourAdClicking(String username, String password){
        clickPostYourAdButton();
        changeUsernamePassword(username, password);
        clickLoginButton();
    }

    public void whenIChangeUsernamePasswordBySignUpClicking(String username, String password){
        clickSignupButton();
        changeUsernamePassword(username, password);
        clickLoginButton();
    }*/

    public void whenILogoutFromSiteIfUserWasRegisterBySocialWeb(){
        if (clickHereLinkL1.isDisplayed()){
            clickHereLinkL1.click();
        }
    }

    public void verifyThatILoggedOutFromSocialWeb(){
        assertEquals(userNameNotLoggedInputI1.isDisplayed(),true);
    }


}
