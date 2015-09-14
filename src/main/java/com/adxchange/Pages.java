package com.adxchange;

import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by IntelliJ IDEA.
 *
 * @author <a href="mailto:vzhovtiuk@gmail.com">Vitaliy Zhovtyuk</a>
 *         Date: 7/28/15
 *         Time: 5:37 PM
 */
public class Pages {

    private WebDriverProvider driverProvider;
    private HomePage home;
    private LocationPopupPage locationPopupPage;
    private LoginPopupPage loginPopupPage;
    private PostingMyPostsPage postingMyPostsPage;
    private FaceBookPage faceBookPage;
    private TwitterPage twitterPage;
    private CreateNewPostPage createNewPostPage;

    public Pages(WebDriverProvider driverProvider) {
        this.driverProvider = driverProvider;
    }


    public HomePage homePage(){
        if ( home == null ){
            home = new HomePage(driverProvider);
        }
        PageFactory.initElements(driverProvider.get(),  home);
        return home;
    }

    public LocationPopupPage locationPopupPage(){
        if ( locationPopupPage == null ){
            locationPopupPage = new LocationPopupPage(driverProvider);
        }
        PageFactory.initElements(driverProvider.get(),  locationPopupPage);
        return locationPopupPage;
    }

    public LoginPopupPage loginPopupPage(){
        if ( loginPopupPage == null ){
            loginPopupPage = new LoginPopupPage(driverProvider);
        }
        PageFactory.initElements(driverProvider.get(),  loginPopupPage);
        return loginPopupPage;
    }

    public PostingMyPostsPage postingMyPostsPage(){
        if ( postingMyPostsPage == null ){
            postingMyPostsPage = new PostingMyPostsPage(driverProvider);
        }
        PageFactory.initElements(driverProvider.get(),  postingMyPostsPage);
        return postingMyPostsPage;
    }

    public FaceBookPage faceBookPage(){
        if ( faceBookPage == null ){
            faceBookPage = new FaceBookPage(driverProvider);
        }
        PageFactory.initElements(driverProvider.get(),  faceBookPage);
        return faceBookPage;
    }

    public TwitterPage twitterPage(){
        if ( twitterPage == null ){
            twitterPage = new TwitterPage(driverProvider);
        }
        PageFactory.initElements(driverProvider.get(),  twitterPage);
        return twitterPage;
    }

    public CreateNewPostPage createNewPostPage(){
        if ( createNewPostPage == null ){
            createNewPostPage = new CreateNewPostPage(driverProvider);
        }
        PageFactory.initElements(driverProvider.get(),  createNewPostPage);
        return createNewPostPage;
    }
}