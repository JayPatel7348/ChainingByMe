package com.qa.emp.tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertCheck {
    @Test
    public void softAssert() {
        WebDriver driver = new ChromeDriver();
        SoftAssert softAssertCheck = new SoftAssert();
        driver.navigate().to("https://www.browserstack.com/");
        String getActualTitle = driver.getTitle();
        Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform | BrowserStack");
        softAssertCheck.assertEquals(getActualTitle, "Most Reliable App & Cross Browser Testing Platform | BrowserStack");
        softAssertCheck.assertNotEquals(getActualTitle, "Most Reliable App & Cross Browser Testing Platform | BrowserStack");
        softAssertCheck.assertNull(verifyTitle);
        softAssertCheck.assertNotNull(verifyTitle);
        softAssertCheck.assertTrue("BrowserStack".equals("Browserstack"), "First soft assert failed");
        softAssertCheck.assertFalse("BrowserStack".equals("BrowserStack"), "Second soft assert failed");
        softAssertCheck.assertAll();
    }
}