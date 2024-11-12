package com.qa.emp.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class ALoginTest extends BaseTest {

    private WebDriver driver;

    @Test
    public void doSuccessfulLogin(){
        aLgnPg.doLogin(prop.getProperty("username").trim(), prop.getProperty("password").trim() );
        Assert.assertEquals(aLgnPg.getHomePageTitle(),prop.getProperty("homePageTitle"));
    }

    @Test (priority = 1) @Ignore
    public void testShowHidePswdLinkText(){
        aLgnPg.pswdShowLabelClickable();
    }

    @Test (priority = 2,enabled=false)
    public void testShowHidePswdLinkText1(){
        aLgnPg.pswdShowLabelClickable();
    }
}
