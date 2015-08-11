package com.adxchange.steps;

import com.adxchange.Pages;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasicWebSteps {
    public Pages pages;

    public BasicWebSteps(Pages pages) {
        this.pages = pages;
    }

    /*---------location----------*/

    @Given("I navigate to testsystem")
    public void navigate() {
        pages.homePage().open();
    }

    @When("I change location1 to $state,$city")
    public void whenIChangeLocation1(String state, String city) {
        pages.locationPopupPage().changeLocation1(state, city);
    }
    @Then("I verify location1 as $state,$city")
    public void verifySelectedLocation1(String state, String city) {
        pages.homePage().verifySelectedLocation1(state, city);
    }

    @When("I change location2 to ZIP $zipCode")
    public void whenIChangeLocation2(String zipCode) {
        pages.locationPopupPage().changeLocation2(zipCode);
    }
    @Then("I verify location2 as: $state,$city")
    public void verifySelectedLocation2(String state, String city) {
        pages.locationPopupPage().verifySelectedLocation2(state, city);
    }

    /*---------login----------*/

    @When("I login to the site under $email,$password")
    public void whenILoginToTheSite(String email, String password) {
        pages.loginPopupPage().whenILoginToTheSite(email, password);
    }

    @Then("I verify user name in welcomeBack as $firstName $lastName")
    public void verifyWelcomeBack(String firstName, String lastName) {
        pages.homePage().verifyWelcomeBack(firstName, lastName);
    }

    @Then("I verify search $keyword")
    public void verifySearch(String keyword) {// verifying search element in google home page
        pages.homePage().search(keyword);
    }
}