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

/*    @Given("I change Username,Password by \"POST YOUR AD\" clicking to $username,$password")
    @When("I change Username,Password by \"POST YOUR AD\" clicking to $username,$password")
    public void changeUsernamePasswordByPostYourAdClicking(String username, String password) {
        pages.loginPopupPage().changeUsernamePasswordByPostYourAdClicking(username, password);
    }*/

    @Given("I click \"POST YOUR AD\" button")
    @When("I click \"POST YOUR AD\" button")
    public void clickPostYourAdButton() {
        pages.loginPopupPage().clickPostYourAdButton();
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

    @Given("I click \"SIGNUP\" button")
    @When("I click \"SIGNUP\" button")
    public void clickSignupButton() {
        pages.loginPopupPage().clickSignupButton();
    }

/*    @When("I change Username,Password by \"SIGNUP\" clicking to $username,$password")
    public void whenIChangeUsernamePasswordBySignUpClicking(String username, String password) {
        pages.loginPopupPage().whenIChangeUsernamePasswordBySignUpClicking(username, password);
    }*/

    @When("I click \"LOG OUT\" button")
    @Then("I click \"LOG OUT\" button")
    public void clickLogOutButton() {
        pages.homePage().clickLogOutButton();
    }

    @Then("I verify \"Ad Name\"")
    public void verifyAdName() {
        pages.postingMyPostsPage().verifyAdName();
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

    /*---------external logOut----------*/

    @Given("I logout from site if user was register by social web")
    @When("I logout from site if user was register by social web")
    public void whenILogoutFromSiteIfUserWasRegisterBySocialWeb() {
        pages.loginPopupPage().whenILogoutFromSiteIfUserWasRegisterBySocialWeb();
    }

    @Given("I verify that I logged out from social web")
    @When("I verify that I logged out from social web")
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

    @Given("I choose category as Real Estate")
    public void chooseCategory() {
        pages.createNewPostPage().chooseCategory();
    }

    @Given("I click \"Next\" button1")
    public void clickNextButton1() {
        pages.createNewPostPage().clickNextButton1();
    }

    @Given("I click \"Next\" button2")
    public void clickNextButton2() {
        pages.createNewPostPage().clickNextButton2();
    }

    @Given("I choose layout as Left")
    public void chooseLayoutAsLeft() {
        pages.createNewPostPage().chooseLayoutAsLeft();
    }

    @Given("I choose layout as Panoramic")
    public void chooseLayoutAsPanoramic() {
        pages.createNewPostPage().chooseLayoutAsPanoramic();
    }

    @Given("I choose layout as Right")
    public void chooseLayoutAsRight() {
        pages.createNewPostPage().chooseLayoutAsRight();
    }

    @Given("I select Property Type as $propertyType")
    public void selectPropertyType(String propertyType) {
        pages.createNewPostPage().selectPropertyType(propertyType);
    }

    @Given("I select Transaction Type as $transactionType")
    public void selectTransactionType(String transactionType) {
        pages.createNewPostPage().selectTransactionType(transactionType);
    }

    @Given("I change Title to $title")
    public void changeTitle(String title) {
        pages.createNewPostPage().changeTitle(title);
    }

    @Given("I change Address to $address")
         public void changeAddress(String address) {
        pages.createNewPostPage().changeAddress(address);
    }

    @Given("I change Suite to $suite")
    public void changeSuite(String suite) {
        pages.createNewPostPage().changeSuite(suite);
    }

    @Given("I select State as $state")
    public void selectState(String state) {
        pages.createNewPostPage().selectState(state);
    }

    @Given("I select City as $city")
    public void selectCity(String city) {
        pages.createNewPostPage().selectCity(city);
    }

    @Given("I change Zip/Postal Code to $zipPostal")
    public void changeZipPostalCode(String zipPostal) {
        pages.createNewPostPage().changeZipPostalCode(zipPostal);
    }

    @Given("I check \"Hide Exact Address\" checkbox")
    public void checkHideExactAddressCheckbox() {
        pages.createNewPostPage().checkHideExactAddressCheckbox();
    }

    @Given("I select Seller Type as $sellerType")
    public void selectSellerType(String sellerType) {
        pages.createNewPostPage().selectSellerType(sellerType);
    }

    @Given("I change Offer Price to $offerPrice")
    public void changeOfferPrice(String offerPrice) {
        pages.createNewPostPage().changeOfferPrice(offerPrice);
    }

    @Given("I select Currency as $currency")
    public void selectCurrency(String currency) {
        pages.createNewPostPage().selectCurrency(currency);
    }

    @Given("I select Beds as $bedsNum")
    public void selectBeds(String bedsNum) {
        pages.createNewPostPage().selectBeds(bedsNum);
    }

    @Given("I select Baths as $bathsNum")
    public void selectBaths(String bathsNum) {
        pages.createNewPostPage().selectBaths(bathsNum);
    }

    @Given("I select Main Image as Image1")
    public void selectMainImage() {
        pages.createNewPostPage().selectMainImage();
    }

    @Given("I click \"Save\" button")
    public void clickSaveButton() {
        pages.createNewPostPage().clickSaveButton();
    }

    @Given("I change Post Title to $postTitle")
    public void changePostTitle(String postTitle) {
        pages.createNewPostPage().changePostTitle(postTitle);
    }

    @Given("I click \"Save\" Post Title button")
    public void clickSavePostTitleButton() {
        pages.createNewPostPage().clickSavePostTitleButton();
    }

    @Given("I click Confirm Save \"YES\" button")
    public void clickConfirmSaveYesButton() {
        pages.createNewPostPage().clickConfirmSaveYesButton();
    }

    @Given("I click Posting Save Status \"OK\" button")
    public void clickPostingSaveStatusOkButton() {
        pages.createNewPostPage().clickPostingSaveStatusOkButton();
    }

    @Given("I click Close Window \"x\" button")
    public void clickCloseWindowXButton() {
        pages.createNewPostPage().clickCloseWindowXButton();
    }

    @Given("I click \"My Posts\" tab")
    public void clickMyPostsTab() {
        pages.createNewPostPage().clickMyPostsTab();
    }



        /*---------external logIn----------*/

/*    @When("I login to site by Facebook as $username,$password")
    public void whenILoginToSiteByFacebook(String username, String password) {
        pages.faceBookPage().whenILoginToSiteByFacebook(username, password);
    }*/

/*    @When("I login to site by Twitter as $username,$password")
    public void whenILoginToSiteByTwitter(String username, String password) {
        pages.twitterPage().whenILoginToSiteByTwitter(username, password);
    }*/

    @Given("I click \"Facebook\" button")
    public void clickFacebookButton() {
        pages.faceBookPage().clickFacebookButton();
    }

    @Given("I click \"Twitter\" button")
    public void clickTwitterButton() {
        pages.twitterPage().clickTwitterButton();
    }

    @Given("I click \"Authorize\" button")
    public void clickAuthorizeButton() {
        pages.twitterPage().clickAuthorizeButton();
    }

    @Given("I click \"Google+\" button")
    public void clickGooglePlusButton() {
        pages.googlePlusPage().clickGooglePlusButton();
    }

    @Given("I choose \"Google+\" account as adxchange92@gmail.com")
    public void chooseGooglePlusAccount() {
        pages.googlePlusPage().chooseGooglePlusAccount();
    }

/*    @Given("I change Email to new Email")
    public void changeEmailToNew() {
        pages.faceBookPage().changeEmailToNew();
    }*/

}