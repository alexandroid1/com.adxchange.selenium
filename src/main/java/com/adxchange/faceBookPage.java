package com.adxchange;

import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

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

    @FindBy(how = How.ID, using = "socialLoginCompleteContainer")
    private WebElement socialLoginCompleteContainerC1;

    @FindBy(how = How.ID, using = "emailAddress")
    private WebElement emailAddressInputI3;

    @FindBy(how = How.ID, using = "firstName")
    private WebElement firstNameInputI4;

    @FindBy(how = How.ID, using = "lastName")
    private WebElement lastNameInputI5;

    @FindBy(how = How.NAME, using = "dob")
    private WebElement datePickerInputDP1;

    @FindBy(how = How.LINK_TEXT, using = "1")
    private WebElement uiDatePickerWeekEndUDP1;

    @FindBy(how = How.ID, using = "user_gender")
    private WebElement userGenderSelectS1;

    @FindBy(how = How.ID, using = "submitBtnB1")
    private WebElement submitBtnB1;

    @FindBy(how = How.ID, using = "welcomeBack")
    private WebElement welcomeBackBtnB1;

    @FindBy(how = How.CLASS_NAME, using = "ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only")
    private WebElement enteredEmailHasAlreadyRegisteredOkBtnB2;

    @FindBy(how = How.LINK_TEXT, using = "Click here")
    private WebElement profileDetailIsUpdatedClickHereLinkL1 ;

    public FaceBookPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void clickFacebookButton() {
        facebookIdImgBtnB4.click();
    }

    public void changeEmailToNew() {
        WebDriver driver = getDriverProvider().get();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(socialLoginCompleteContainerC1));

        emailAddressInputI3.sendKeys("@theadxchange.com");
    }

    public void whenILoginToSiteByFacebook(String username, String password) {
        signUpBtnB1.click();
        facebookIdImgBtnB4.click();
        loginToFacebook(username, password);
    }

    public void loginToFacebook(String username, String password){
        WebDriver driver = getDriverProvider().get();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(emailInputI1));
        emailInputI1.click();
        emailInputI1.sendKeys(username);
        passInputI2.sendKeys(password);
        loginButtonBtnB1.click();
        if (okButtonBtnB2.isDisplayed()){
            okButtonBtnB2.click();
        }
        wait.until(ExpectedConditions.visibilityOf(socialLoginCompleteContainerC1));
        socialLoginCompleteContainerAuth(username, password);
        if (profileDetailIsUpdatedClickHereLinkL1.isDisplayed()) {
            profileDetailIsUpdatedClickHereLinkL1.click();
        }
    }

    public void socialLoginCompleteContainerAuth(String username, String password){
        WebDriver driver = getDriverProvider().get();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(socialLoginCompleteContainerC1));
        emailAddressInputI3.sendKeys(username);
        firstNameInputI4.sendKeys("Donald");
        lastNameInputI5.sendKeys("Frantum");
        datePickerInputDP1.click();
        uiDatePickerWeekEndUDP1.click(); //01/09/2002
        Select clickThisGender = new Select(userGenderSelectS1);
        clickThisGender.selectByValue("male");
        submitBtnB1.click();
    }
}
