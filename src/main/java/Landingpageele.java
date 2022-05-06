import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;

import static org.jsoup.nodes.Entities.EscapeMode.base;

public class Landingpageele extends base {
    @FindBy(xpath = "//*[@id=\"rd-navbar-aside\"]/ul/li[2]/a") WebElement loginnav;
    @FindBy(xpath ="//*[@id=\"signin-mobile_no\"]") WebElement loginmobinput;
    @FindBy(xpath ="//*[@id=\"signin-password\"]") WebElement loginpasswordinput;
    @FindBy(xpath = "//*[@id=\"login-form\"]/p[3]/input") WebElement loginbutton;
    @FindBy(xpath = "//*[@id=\"login-form\"]/div/div[2]/span") WebElement moberr;
    @FindBy(xpath = "/html/body/div[4]/div[7]/div/button")  WebElement sesspopupok;




    public Landingpageele(){
        PageFactory.initElements(driver, this);
    }
    public void clickloginnav(){
        loginnav.click();
    }
    public void entermobno(String mob){
        loginmobinput.sendKeys(mob);
    }
    public void enterpassword(String pwd){
        loginpasswordinput.sendKeys("abc123");
    }
    public void clicklogin(){
        loginbutton.click();
    }
    public String getmobfielderr(){
        return moberr.getText();
    }
    public void clicksessok(){
       sesspopupok.click();
    }
}


