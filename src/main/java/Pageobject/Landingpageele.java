package Pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Landingpageele extends Base {
    @FindBy(xpath = "//*[@id=\"rd-navbar-aside\"]/ul/li[2]/a")
    WebElement loginnav;
    @FindBy(xpath ="//*[@id=\"signin-mobile_no\"]")
    WebElement loginmobinput;
    @FindBy(xpath = "//*[@id=\"signin-password\"]")
    WebElement loginpasswordinput;
    @FindBy(xpath = "//*[@id=\"login-form\"]/p[3]/input")
    WebElement loginbutton;
    @FindBy(xpath = "//*[@id=\"login-form\"]/div/div[2]/span")
    WebElement moberr;
    @FindBy(xpath = "//*[@id=\"login-form\"]/small")
    WebElement pwderr;
    @FindBy(xpath = "//button[@class=\"confirm\"]")
    WebElement sesspopupok;



    public Landingpageele() {
        PageFactory.initElements(Base.driver, this);
    }

    public void clickloginnav() {
        loginnav.click();
    }

    public void entermobno(String mob) {
        loginmobinput.sendKeys(mob);
    }

    public void enterpassword(String pwd) {
        loginpasswordinput.sendKeys(pwd);
    }

    public void clicklogin() {
        loginbutton.click();
    }

    public String getmobfielderr() {
        return moberr.getText();
    }
    public String getpwdfielderr(){
        return pwderr.getText();
    }

    public void clicksessok() {
        sesspopupok.click();
    }


}

