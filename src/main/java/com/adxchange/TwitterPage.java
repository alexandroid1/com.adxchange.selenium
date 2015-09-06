package com.adxchange;

import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by ALEX on 06.09.2015.
 */
public class TwitterPage extends AbstractPage {

    @FindBy(how = How.ID, using = "signUp")
    private WebElement signUpBtnB1;

    public TwitterPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }


}
