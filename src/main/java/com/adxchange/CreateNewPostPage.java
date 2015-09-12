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
 * Created by ALEX on 11.09.2015.
 */
public class CreateNewPostPage extends AbstractPage {

    @FindBy(how = How.LINK_TEXT, using = "Real Estate")
    private WebElement realEstateLinkL1;

    public CreateNewPostPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void chooseCategory(String categoryName,String value){
        realEstateLinkL1.click();
    }
}
