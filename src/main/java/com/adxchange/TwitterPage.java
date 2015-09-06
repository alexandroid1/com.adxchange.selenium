package com.adxchange;

import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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

    @FindBy(how = How.ID, using = "socialLoginCompleteContainer")
    private WebElement socialLoginCompleteContainerC1;

    @FindBy(how = How.ID, using = "emailAddress")
    private WebElement emailAddressInputI3;

    @FindBy(how = How.ID, using = "firstName")
    private WebElement firstNameInputI4;

    @FindBy(how = How.ID, using = "lastName")
    private WebElement lastNameInputI5;

    @FindBy(how = How.CLASS_NAME, using = "social-dob hasDatepicker")
    private WebElement datePickerInputDP1;

    @FindBy(how = How.LINK_TEXT, using = "1")
    private WebElement uiDatePickerWeekEndUDP1;

    @FindBy(how = How.ID, using = "user_gender")
    private WebElement userGenderSelectS1;

    @FindBy(how = How.LINK_TEXT, using = "Male")
    private WebElement userGenderOptionOpt1;

    public TwitterPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void whenILoginToSiteByTwitter(String username, String password){
        signUpBtnB1.click();
        twitterIdImgBtnB2.click();
        userNameInputI1.sendKeys(username);
        passwordInputI2.sendKeys(password);
        allowButtonBtnB3.click();
        /*---socialLoginCompleteContainer auth---*/
        WebDriver driver = getDriverProvider().get();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(socialLoginCompleteContainerC1));
        emailAddressInputI3.sendKeys(username);
        firstNameInputI4.sendKeys("Donald");
        lastNameInputI5.sendKeys("Frantum");
        Select clickThisDate = new Select(datePickerInputDP1);
        clickThisDate.selectByValue("1");
        Select clickThisGender = new Select(userGenderSelectS1);
        clickThisGender.selectByValue("Male");
        //datePickerInputDP1.click();
        //uiDatePickerWeekEndUDP1.click(); //01/09/2002
        //userGenderSelectS1.click();
        //userGenderOptionOpt1.click();


    }




}
