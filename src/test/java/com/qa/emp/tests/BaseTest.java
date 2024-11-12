package com.qa.emp.tests;

import factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.AdminLoginPage;

import java.util.Properties;

public class BaseTest {

    WebDriver driver;
    DriverFactory df;
    Properties prop;
    AdminLoginPage aLgnPg;

    @BeforeTest
    public void setUp() {
        df = new DriverFactory();
        prop = df.init_prop();
        driver = df.init_driver(prop);
        aLgnPg=new AdminLoginPage(driver);
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }

}
