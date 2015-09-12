package com.adxchange.steps;

import com.adxchange.Pages;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class BasicWebSteps {

    public Pages pages;

    public BasicWebSteps(Pages pages) {
        this.pages = pages;
    }

    /*---------location----------*/

    @Given("I navigate to testsystem")
    @When("I navigate to testsystem")
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

    /*---------login----------*/

    @Given("I change Username,Password by \"POST YOUR AD\" clicking to $username,$password")
    @When("I change Username,Password by \"POST YOUR AD\" clicking to $username,$password")
    public void changeUsernamePasswordByPostYourAdClicking(String username, String password) {
        pages.loginPopupPage().changeUsernamePasswordByPostYourAdClicking(username, password);
    }

    @Given("I change Username,Password to $username,$password")
    @When("I change Username,Password to $username,$password")
    public void changeUsernamePassword(String username, String password) {
        pages.loginPopupPage().changeUsernamePassword(username, password);
    }

    @Given("I click \"Login\" button")
    @When("I click \"Login\" button")
    public void clickLoginButton() {
        pages.loginPopupPage().clickLoginButton();
    }

    @When("I change Username,Password by \"SIGNUP\" clicking to $username,$password")
    public void whenIChangeUsernamePasswordBySignUpClicking(String username, String password) {
        pages.loginPopupPage().whenIChangeUsernamePasswordBySignUpClicking(username, password);
    }

    @When("I click \"LOG OUT\" button")
    @Then("I click \"LOG OUT\" button")
    public void clickLogOutButton() {
        pages.homePage().clickLogOutButton();
    }

    @Given("I verify \"Welcome back\" as $firstName,$lastName")
    @Then("I verify \"Welcome back\" as $firstName,$lastName")
    public void verifyWelcomeBackAsFirstNameLastName(String firstName, String lastName) {
        pages.postingMyPostsPage().verifyWelcomeBackAsFirstNameLastName(firstName, lastName);
    }

    @Then("I verify that label \"LOG OUT\" changed to \"SIGNUP\"")
    public void verifyThatLabelLogOutChangedToSignUp() {
        pages.homePage().verifyThatLabelLogOutChangedToSignUp();
    }

    /*---------external logIn----------*/

    @When("I login to site by Facebook as $username,$password")
    public void whenILoginToSiteByFacebook(String username, String password) {
        pages.faceBookPage().whenILoginToSiteByFacebook(username, password);
    }

    @When("I login to site by Twitter as $username,$password")
    public void whenILoginToSiteByTwitter(String username, String password) {
        pages.twitterPage().whenILoginToSiteByTwitter(username, password);
    }

    /*---------external logOut----------*/
    @Given("I logout from site if user was register by social web")
    @When("I logout from site if user was register by social web")
    public void whenILogoutFromSiteIfUserWasRegisterBySocialWeb() {
        pages.loginPopupPage().whenILogoutFromSiteIfUserWasRegisterBySocialWeb();
    }

    @Given("I verify that I logged out from social web")
    @Then("I verify that I logged out from social web")
    public void verifyThatILoggedOutFromSocialWeb() {
        pages.loginPopupPage().verifyThatILoggedOutFromSocialWeb();
    }

    /*---------search----------*/

    @Then("I verify search $keyword")
    public void verifySearch(String keyword) {// verifying search element in google home page
        pages.homePage().search(keyword);
    }

    /*----------- Post_AD Story --------------------*/

    @Given("I click \"POST YOUR AD\" button")
    public void clickPostYourAdButton() {
        pages.loginPopupPage().clickPostYourAdButton();
    }

    @Given("I choose category as $categoryName,$value")
    public void chooseCategory(String categoryName,String value) {
        pages.createNewPostPage().chooseCategory(categoryName,value);
    }

}