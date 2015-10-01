package com.adxchange;

import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by ALEX on 01.10.2015.
 */
public class GooglePlusPage extends AbstractPage {

    @FindBy(how = How.ID, using = "googlePlusIdImg")
    private WebElement googlePlusIdImgBtnB1;

    @FindBy(how = How.XPATH, using = ".//*[@value='adxchange92@gmail.com']")
    private WebElement googlePlusAccountLinkL1;

    public GooglePlusPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void clickGooglePlusButton() {
        googlePlusIdImgBtnB1.click();
    }

    public void chooseGooglePlusAccount() {
        googlePlusAccountLinkL1.click();
    }

}
