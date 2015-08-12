package com.adxchange.steps;

import com.adxchange.Pages;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasicWebSteps {
    public static WebDriver driver;

    public Pages pages;

    public BasicWebSteps(Pages pages) {
        this.pages = pages;
    }

    /*---------location----------*/

    @Given("I navigate to testsystem")
    public void navigate() {
        pages.homePage().open();
    }

    @When("I change location by State,City to $state,$city")
    public void whenIChangeLocationByStateCity(String state, String city) {
        pages.locationPopupPage().changeLocationByStateCity(state, city);
    }
    @Then("I verify location by State,City as $state,$city")
    public void verifySelectedLocationByStateCity(String state, String city) {
        pages.homePage().verifySelectedLocationByStateCity(state, city);
    }

    @When("I change location by ZIP to ZIP $zipCode")
    public void whenIChangeLocationByZIP(String zipCode) {
        pages.locationPopupPage().changeLocationByZIP(zipCode);
    }

    @Then("I verify location by ZIP as: $state,$city")
    public void verifySelectedLocationByZIP(String state, String city) {
        pages.locationPopupPage().verifySelectedLocationByZIP(state, city);
    }

    @Given("I change location to fake location")
    public void whenIChangeLocationToFakeLocation() {
        pages.homePage().whenIChangeLocationToFakeLocation();
    }

    /*---------login----------*/

    @When("I login to the site under $email,$password")
    public void whenILoginToTheSite(String email, String password) {
        pages.loginPopupPage().whenILoginToTheSite(email,password);
    }

    @Then("I verify user name in welcomeBack as $firstName $lastName")
    public void verifyWelcomeBack(String firstName, String lastName) {
        pages.homePage().verifyWelcomeBack(firstName, lastName);
    }

    /*---------template elements----------*/

    @Then("I verify template elements")
    public void verify() {// verifying search element in google home page         
        driver.findElement(By.className("logo")).isDisplayed();
        driver.findElement(By.id("locationContainer")).isDisplayed();
        driver.findElement(By.tagName("footer")).isDisplayed();
    }

    /*---------search----------*/

    @Then("I verify search $keyword")
    public void verifySearch(String keyword) {// verifying search element in google home page
        pages.homePage().search(keyword);
    }
}