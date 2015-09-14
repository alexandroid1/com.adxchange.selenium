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

    @FindBy(how = How.ID, using = "nextButtonBtn1")
    private WebElement nextButtonBtn1;

    @FindBy(how = How.ID, using = "attr-r-11")
    private WebElement LeftLayoutLinkL2;

    @FindBy(how = How.ID, using = "attr-r-12")
    private WebElement PanoramicLayoutLinkL3;

    public CreateNewPostPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void chooseCategory(){
        WebDriver driver = getDriverProvider().get();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(realEstateLinkL1));
        wait.until(ExpectedConditions.elementToBeClickable(realEstateLinkL1));
        realEstateLinkL1.click();
    }

    public void clickNextButton(){
        nextButtonBtn1.click();
    }

    public void chooseLayoutAsLeft(){
        WebDriver driver = getDriverProvider().get();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(LeftLayoutLinkL2));
        wait.until(ExpectedConditions.elementToBeClickable(LeftLayoutLinkL2));
        LeftLayoutLinkL2.click();
    }

    public void chooseLayoutAsPanoramic(){
        WebDriver driver = getDriverProvider().get();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(PanoramicLayoutLinkL3));
        wait.until(ExpectedConditions.elementToBeClickable(PanoramicLayoutLinkL3));
        PanoramicLayoutLinkL3.click();
    }
}
