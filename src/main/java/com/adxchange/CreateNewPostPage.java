package com.adxchange;

import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

/**
 * Created by ALEX on 11.09.2015.
 */
public class CreateNewPostPage extends AbstractPage {

    @FindBy(how = How.XPATH, using = ".//form/div[1]/div[2]/label/input")
    private WebElement realEstateLinkL1;

    @FindBy(how = How.XPATH, using = ".//div[1]/div[4]/div[1]/button")
    private WebElement nextButtonBtnB1;

    @FindBy(how = How.XPATH, using = ".//div[2]/div[4]/div[1]/button")
    private WebElement nextButtonBtnB2;

    @FindBy(how = How.ID, using = "attr-r-11")
    private WebElement LeftLayoutLinkL2;

    @FindBy(how = How.ID, using = "attr-r-12")
    private WebElement PanoramicLayoutLinkL3;

    @FindBy(how = How.ID, using = "attr-r-13")
    private WebElement RightLayoutLinkL4;

    @FindBy(how = How.ID, using = "attr-o-20")
    private WebElement propertyTypeSelectS1;

    @FindBy(how = How.XPATH, using = "//select[@data-bvalidator-msg='Please provide value for Transaction Type']")
    private WebElement transactionTypeSelectS2;

    @FindBy(how = How.ID, using = "attr-o-15")
    private WebElement changeTitleInputI1;

    @FindBy(how = How.ID, using = "attr-o-26")
    private WebElement changeAddressInputI2;

    @FindBy(how = How.ID, using = "attr-o-27")
    private WebElement changeSuiteInputI3;

    @FindBy(how = How.ID, using = "attr-o-29")
    private WebElement stateSelectS3;

    @FindBy(how = How.ID, using = "attr-o-28")
    private WebElement citySelectS4;

    @FindBy(how = How.ID, using = "attr-o-30")
    private WebElement changeZipPostalCodeInputI4;

    @FindBy(how = How.ID, using = "attr-c-31")
    private WebElement hideExactAddressCheckboxCh1;

    @FindBy(how = How.ID, using = "attr-o-16")
    private WebElement sellerTypeSelectS5;

    @FindBy(how = How.ID, using = "attr-o-22")
    private WebElement changeOfferPriceInputI5;

    @FindBy(how = How.XPATH, using = ".//div[6]/div[3]/div/select")
    private WebElement currencySelectS6;

    @FindBy(how = How.XPATH, using = ".//div[6]/div[4]/div/select")
    private WebElement bedsNumSelectS7;

    @FindBy(how = How.XPATH, using = ".//div[6]/div[5]/div/select")
    private WebElement bathsNumSelectS81;

    @FindBy(how = How.NAME, using = "postingImage_1")
    private WebElement MainImageSelectS8;

    @FindBy(how = How.ID, using = "btnClose")
    private WebElement submitButtonBtnB3;

    @FindBy(how = How.XPATH, using = ".//div[3]/div[4]/div[3]/button[1]")
    private WebElement saveButtonBtnB4;

    @FindBy(how = How.ID, using = "postTitle")
    private WebElement postTitleInputI6;

    @FindBy(how = How.XPATH, using = ".//div[3]/div/button[1]")
    private WebElement savePostTitleButtonBtnB5;

    @FindBy(how = How.XPATH, using = ".//div[9]/div[3]/div/button[1]")
    private WebElement confirmSaveYesButtonBtnB6;

    @FindBy(how = How.XPATH, using = ".//div[10]/div[3]/div/button")
    private WebElement postingSaveStatusOkButtonB7;

    @FindBy(how = How.XPATH, using = ".//div[8]/div[1]/a/span")
    private WebElement closeWindowXButtonBtnB7;

    @FindBy(how = How.XPATH, using = ".//body/header/nav/div/ul/li[3]/a")
    private WebElement clickMyPostsTabT1;

    public CreateNewPostPage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }


    public void chooseCategory() {
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

    public void changeTitle(String title){
        changeTitleInputI1.sendKeys(title);
    }

    public void changeAddress(String address){
        changeAddressInputI2.sendKeys(address);
    }

    public void changeSuite(String suite){
        changeSuiteInputI3.sendKeys(suite);
    }

    public void selectState(String state){
        Select clickThisState = new Select(stateSelectS3);
        clickThisState.selectByVisibleText(state);
    }

    public void selectCity(String city){
        Select clickThisCity = new Select(citySelectS4);
        clickThisCity.selectByVisibleText(city);
    }

    public void changeZipPostalCode(String zipPostal){
        changeZipPostalCodeInputI4.sendKeys(zipPostal);
    }

    public void checkHideExactAddressCheckbox(){
        hideExactAddressCheckboxCh1.click();
    }

    public void selectSellerType(String sellerType){
        Select clickThisSellerType = new Select(sellerTypeSelectS5);
        clickThisSellerType.selectByVisibleText(sellerType);
    }

    public void changeOfferPrice(String offerPrice){
        changeOfferPriceInputI5.sendKeys(offerPrice);
    }

    public void selectCurrency(String currency){
        Select clickThisCurrency = new Select(currencySelectS6);
        clickThisCurrency.selectByVisibleText(currency);
    }

    public void selectBeds(String bedsNum){
        Select clickThisBeds = new Select(bedsNumSelectS7);
        clickThisBeds.selectByVisibleText(bedsNum);
    }

    public void selectBaths(String bathsNum){
        Select clickThisBaths = new Select(bathsNumSelectS81);
        clickThisBaths.selectByVisibleText(bathsNum);
    }

    public static void setClipboardData(String string) {
        StringSelection stringSelection = new StringSelection(string);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

    }

    public void selectMainImage(){
        URL url = CreateNewPostPage.class.getClassLoader().getResource("Hriz.jpg");
        URI path = null;
        try {
            path = url.toURI();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        MainImageSelectS8.sendKeys(path.toString());
        submitButtonBtnB3.click();
    }

    public void clickSaveButton(){
        WebDriver driver = getDriverProvider().get();
        WebDriverWait wait = new WebDriverWait(driver, 30);

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(0,Math.max(document.documentElement.scrollHeight," +
                "document.body.scrollHeight,document.documentElement.clientHeight));");

        wait.until(ExpectedConditions.visibilityOf(saveButtonBtnB4));
        wait.until(ExpectedConditions.elementToBeClickable(saveButtonBtnB4));
        saveButtonBtnB4.click();
    }

    private static final String mCHAR = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    private static final int STR_LENGTH = 9; // random string lenght
    Random random = new Random();

    public String createRandomString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < STR_LENGTH; i++) {
            int number = random.nextInt(mCHAR.length());
            char ch = mCHAR.charAt(number);
            builder.append(ch);
        }
        return builder.toString();
    }

    public void changePostTitle(String postTitle){
        WebDriver driver = getDriverProvider().get();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(postTitleInputI6));
        wait.until(ExpectedConditions.elementToBeClickable(postTitleInputI6));
        Pages.postTitleRandomString = postTitle + "_" + createRandomString();
        postTitleInputI6.sendKeys(Pages.postTitleRandomString);
    }

    public void clickSavePostTitleButton(){
        WebDriver driver = getDriverProvider().get();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(savePostTitleButtonBtnB5));
        wait.until(ExpectedConditions.elementToBeClickable(savePostTitleButtonBtnB5));
        savePostTitleButtonBtnB5.click();
    }

    public void clickConfirmSaveYesButton() {
        WebDriver driver = getDriverProvider().get();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(confirmSaveYesButtonBtnB6));
        wait.until(ExpectedConditions.elementToBeClickable(confirmSaveYesButtonBtnB6));
        confirmSaveYesButtonBtnB6.click();
    }

    public void clickPostingSaveStatusOkButton(){
        WebDriver driver = getDriverProvider().get();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(postingSaveStatusOkButtonB7));
        wait.until(ExpectedConditions.elementToBeClickable(postingSaveStatusOkButtonB7));
        postingSaveStatusOkButtonB7.click();
    }

    public void clickCloseWindowXButton(){
        closeWindowXButtonBtnB7.click();
    }

    public void clickMyPostsTab(){
        WebDriver driver = getDriverProvider().get();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(clickMyPostsTabT1));
        wait.until(ExpectedConditions.elementToBeClickable(clickMyPostsTabT1));
        clickMyPostsTabT1.click();
    }

}
