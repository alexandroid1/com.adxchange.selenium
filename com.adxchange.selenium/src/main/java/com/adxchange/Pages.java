package com.adxchange;

import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;

/**
 * Created by IntelliJ IDEA.
 *
 * @author <a href="mailto:vzhovtiuk@gmail.com">Vitaliy Zhovtyuk</a>
 *         Date: 7/28/15
 *         Time: 5:37 PM
 */
public class Pages {

    private final WebDriverProvider driverProvider;
    private HomePage home;
    private ResumePage runStory;

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

    public ResumePage resumePage() {
        if ( runStory == null ){
            runStory = new ResumePage(driverProvider);
        }
        return runStory;
    }


}