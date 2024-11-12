package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {

    private WebDriver driver;

    public ElementUtil(WebDriver driver){this.driver=driver;}

    public By getBy(String locatortype, String locatorvalue) {
        By locator = null;
        switch (locatortype.toLowerCase()) {
            case "id":
                locator = By.id(locatorvalue);
                break;
            case "name":
                locator = By.name(locatorvalue);
                break;
            case "classname":
                locator = By.className(locatorvalue);
                break;
            case "xpath":
                locator = By.xpath(locatorvalue);
                break;
            case "css":
                locator = By.cssSelector(locatorvalue);
                break;
            case "linktext":
                locator = By.linkText(locatorvalue);
                break;
            case "partiallinktext":
                locator = By.partialLinkText(locatorvalue);
                break;
            case "tagname":
                locator = By.tagName(locatorvalue);
                break;

            default:
                break;
        }
        return locator;
    }

    public WebElement getElement(By locator) {
        return driver.findElement(locator);
    }

    public void doSend(By locator, String value) {
        getElement(locator).sendKeys(value);
    }

    public void doSend(String locatortype, String locatorvalue, String value) {
        getElement(getBy(locatortype, locatorvalue)).sendKeys(value);
    }

    public void doClick(By locator) {
        getElement(locator).click();
    }

}
