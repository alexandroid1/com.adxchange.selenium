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

    public void whenIChangeUsernamePasswordByPostYourAdClicking(String username, String password){
        postYourAdBtnB3.click();
        userNameNotLoggedInputI1.sendKeys(username);
        passWordNotLoggedInputI1.sendKeys(password);
        loginSubmitBtnB2.click();
    }

    public void whenIChangeUsernamePasswordBySignUpClicking(String username, String password){
        signUpBtnB1.click();
        userNameNotLoggedInputI1.sendKeys(username);
        passWordNotLoggedInputI1.sendKeys(password);
        loginSubmitBtnB2.click();
    }

    public void whenILogoutFromSiteIfUserWasRegisterBySocialWeb(){
        signUpBtnB1.click();
        if (clickHereLinkL1.isDisplayed()){
            clickHereLinkL1.click();
        }
    }

    public void verifyThatILoggedOutFromSocialWeb(){
        assertEquals(userNameNotLoggedInputI1.isDisplayed(),true);
    }


}
