package com.adxchange;

import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by ALEX on 11.09.2015.
 */
public class CreateNewPostPage extends AbstractPage {

    @FindBy(how = How.ID, using = "attr-r-1-2")
    private WebElement realEstateLinkL1;

    public CreateNewPostPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void chooseCategory(String categoryName){
        WebDriver driver = getDriverProvider().get();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(realEstateLinkL1));
        wait.until(ExpectedConditions.elementToBeClickable(realEstateLinkL1));
        realEstateLinkL1.click();
    }
}
