package com.adxchange;

import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by ALEX on 01.09.2015.
 */
public class FaceBookPage extends AbstractPage {

    @FindBy(how = How.ID, using = "signUp")
    private WebElement signUpBtnB1;

    @FindBy(how = How.ID, using = "facebookIdImg")
    private WebElement facebookIdImgBtnB4;

    @FindBy(how = How.ID, using = "email")
    private WebElement emailInputI1;

    @FindBy(how = How.ID, using = "pass")
    private WebElement passInputI2;

    @FindBy(how = How.ID, using = "loginbutton")
    private WebElement loginButtonBtnB1;

    @FindBy(how = How.CLASS_NAME, using = "_42ft _4jy0 layerConfirm _51_n autofocus uiOverlayButton _4jy3 _4jy1 selected _51sy")
    private WebElement okButtonBtnB2;

    @FindBy(how = How.ID, using = "welcomeBack")
    private WebElement welcomeBackBtnB1;

    public FaceBookPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void whenILoginToSiteByFacebook(String username, String password){
        signUpBtnB1.click();
        facebookIdImgBtnB4.click();
        if (! welcomeBackBtnB1.isDisplayed()) {
            loginToFacebook(username, password);
        }
    }

    public void loginToFacebook(String username, String password){
        WebDriver driver = getDriverProvider().get();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(emailInputI1));
        emailInputI1.click();
        emailInputI1.sendKeys(username);
        passInputI2.sendKeys(password);
        loginButtonBtnB1.click();
        if (okButtonBtnB2.isEnabled()){
            okButtonBtnB2.click();
        }
    }

}
