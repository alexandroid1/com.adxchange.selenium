package com.adxchange.steps;

import com.adxchange.Pages;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasicWebSteps {
    static WebDriver driver;

    private Pages pages;

    public BasicWebSteps(Pages pages) {
        this.pages = pages;
    }

    @Given("I navigate to testsystem")
    public void navigate() {
        pages.homePage().open();
    }

    @When("I change location to $state $city")
    public void whenIChangeLocation(String state, String city) {
        pages.locationPopupPage().changeLocation(state, city);
    }

    @When("I change location to ZIP $zipCode")
    public void whenIChangeLocation(String zipCode) {
        pages.locationPopupPage().changeLocationWithZIP(zipCode);
    }

    @Then("I verify location as $state $city")
    public void verifySelectedLocation(String state, String city) {
        pages.homePage().verifySelectedLocation(state, city);
    }

    @Then("I verify template elements")
    public void verify() {// verifying search element in google home page         
        driver.findElement(By.className("logo")).isDisplayed();
        driver.findElement(By.id("locationContainer")).isDisplayed();
        driver.findElement(By.tagName("footer")).isDisplayed();
    }

    @Then("I verify search $keyword")
    public void verifySearch(String keyword) {// verifying search element in google home page
        pages.homePage().search(keyword);
    }
}