package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.ElementUtil;

public class AdminLoginPage {

    private WebDriver driver;
    private ElementUtil eleUtil;

    private By emailId=By.name("email");
    private By password=By.name("password");
    private By loginBtn=By.xpath("//button[normalize-space()='Sign in']");
    private By pswdShowLinkText=By.xpath("//span[@class='show']");

    public AdminLoginPage(WebDriver driver){
        this.driver=driver;
        eleUtil=new ElementUtil(driver);
    }


    public void doLogin(String userName,String pswd){
            eleUtil.doSend(emailId,userName);
            eleUtil.doSend(password,pswd);
            eleUtil.doClick(loginBtn);
        }

    public String getHomePageTitle(){
       return driver.getTitle();
    }

    public void pswdShowLabelClickable(){
        WebElement show=driver.findElement(pswdShowLinkText);
        if(show.isDisplayed())
        {
            show.click();
            System.out.println("show label is clickable");
        }
        else{
            System.out.println("show label is Not clickable");
        }
    }
}
