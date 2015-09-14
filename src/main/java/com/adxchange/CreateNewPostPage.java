package com.adxchange;

import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by ALEX on 11.09.2015.
 */
public class CreateNewPostPage extends AbstractPage {

    @FindBy(how = How.ID, using = "attr-r-1-2")
    private WebElement realEstateLinkL1;

/*    @FindBy(how = How.ID, using = "nextButtonBtn1")
    private WebElement nextButtonBtnB1;*/

/*    @FindBy(how = How.XPATH, using = "//button[@id='nextButtonBtn1']")
    private WebElement nextButtonBtnB1;*/

/*    @FindBy(how = How.XPATH, using = "//button[@class='rectangular-button next-tab']")
    private WebElement nextButtonBtnB1;*/

    @FindBy(how = How.XPATH, using = "//button[@value='tabs-1']")
    private WebElement nextButtonBtnB1;

    @FindBy(how = How.XPATH, using = "//button[@value='tabs-2']")
    private WebElement nextButtonBtnB2;

    @FindBy(how = How.ID, using = "attr-r-11")
    private WebElement LeftLayoutLinkL2;

    @FindBy(how = How.ID, using = "attr-r-12")
    private WebElement PanoramicLayoutLinkL3;

    @FindBy(how = How.ID, using = "attr-r-13")
    private WebElement RightLayoutLinkL4;

    @FindBy(how = How.ID, using = "attr-o-20")
    private WebElement propertyTypeSelectS1;

    @FindBy(how = How.ID, using = "attr-o-172")
    private WebElement transactionTypeSelectS2;

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

    public void clickNextButton1(){
        WebDriver driver = getDriverProvider().get();
        WebDriverWait wait = new WebDriverWait(driver, 30);

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(0,Math.max(document.documentElement.scrollHeight," +
                "document.body.scrollHeight,document.documentElement.clientHeight));");

        wait.until(ExpectedConditions.visibilityOf(nextButtonBtnB1));
        wait.until(ExpectedConditions.elementToBeClickable(nextButtonBtnB1));
        nextButtonBtnB1.click();
    }

    public void clickNextButton2(){
        WebDriver driver = getDriverProvider().get();
        WebDriverWait wait = new WebDriverWait(driver, 30);

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(0,Math.max(document.documentElement.scrollHeight," +
                "document.body.scrollHeight,document.documentElement.clientHeight));");

        wait.until(ExpectedConditions.visibilityOf(nextButtonBtnB2));
        wait.until(ExpectedConditions.elementToBeClickable(nextButtonBtnB2));
        nextButtonBtnB2.click();
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

    public void chooseLayoutAsRight(){
        WebDriver driver = getDriverProvider().get();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(RightLayoutLinkL4));
        wait.until(ExpectedConditions.elementToBeClickable(RightLayoutLinkL4));
        RightLayoutLinkL4.click();
    }

    public void selectPropertyType(String propertyType){
        WebDriver driver = getDriverProvider().get();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(propertyTypeSelectS1));
        wait.until(ExpectedConditions.elementToBeClickable(propertyTypeSelectS1));
        Select clickThisPropertyType = new Select(propertyTypeSelectS1);
        clickThisPropertyType.selectByVisibleText(propertyType);
    }

    public void selectTransactionType(String transactionType){
        WebDriver driver = getDriverProvider().get();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(transactionTypeSelectS2));
        wait.until(ExpectedConditions.elementToBeClickable(transactionTypeSelectS2));
        Select clickThisTransactionType = new Select(transactionTypeSelectS2);
        clickThisTransactionType.selectByVisibleText(transactionType);
    }
}
