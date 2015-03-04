package com.example.fm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    public WebDriver driver;
    public String baseUrl;

    @SuppressWarnings("MismatchedQueryAndUpdateOfStringBuilder")
    private StringBuffer verificationErrors = new StringBuffer();

    public NavigationHelper navigationHelper;
    public GroupHelper groupHelper;
    public ContactHelper contactHelper;


    public ApplicationManager (){
        driver = new FirefoxDriver();
        baseUrl = "http://localhost:8888/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        navigationHelper = new NavigationHelper(this);
        groupHelper = new GroupHelper(this);
        contactHelper = new ContactHelper(this);



    }



    public void stop() {
        driver.quit();

    }




}
