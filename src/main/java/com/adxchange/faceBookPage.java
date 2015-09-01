package com.adxchange;

import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by ALEX on 01.09.2015.
 */
public class FaceBookPage extends AbstractPage {

    @FindBy(how = How.ID, using = "email")
    private WebElement emailInputI1;

    @FindBy(how = How.ID, using = "pass")
    private WebElement passInputI2;

    public FaceBookPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void loginToFacebook(String username, String password){
        emailInputI1.sendKeys(username);
        passInputI2.sendKeys(password);
    }

}
