package com.adxchange.steps;

import com.adxchange.Pages;
import org.jbehave.core.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class BasicWebSteps {
    static WebDriver driver;
    
    private Pages pages;

    public BasicWebSteps(Pages pages) {
        this.pages = pages;
    }

    @Given("I am in FF")
    public void invokeBrowser() {
    }

    @Given("I navigate to testsystem")
    public void navigate() {
        pages.homePage().open();
    }

    @Then("I verify template elements")
    public void verify() {// verifying search element in google home page         
        driver.findElement(By.className("logo")).isDisplayed();
        driver.findElement(By.id("locationContainer")).isDisplayed();
        driver.findElement(By.tagName("footer")).isDisplayed();
    }
    
    @Then("I verify search")
    public void verifySearch() {// verifying search element in google home page         
        pages.homePage().search();
    }

    @When("I open change location popup")
    public void clickChangeLocationPopup() {// verifying search element in google home page         
        driver.findElement(By.className("logo")).click();
        driver.findElement(By.id("locationContainer")).isDisplayed();
        driver.findElement(By.tagName("footer")).isDisplayed();
    }
}