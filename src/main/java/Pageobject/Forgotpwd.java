package Pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Forgotpwd extends Base {
    public Forgotpwd(){
        PageFactory.initElements(Base.driver, this);
    }
    @FindBy(xpath = "//*[@id=\"cd-login\"]/p/a") private WebElement forgotpwd;
    @FindBy(xpath = "//*[@id=\"cd-reset-password-otp\"]/p[1]") private WebElement Forgotpwdtitle;
    @FindBy(xpath = "//*[@id=\"reset-number\"]") private WebElement fphoneno;
    @FindBy(xpath = "//*[@id=\"forgot_password_submit\"]") private WebElement resetpwdbtn;
    @FindBy(xpath = "//*[@id=\"otp\"]") private WebElement fotp;
@FindBy(xpath = "//*[@id=\"cd-otp\"]/p") private WebElement fotptitle;
@FindBy(xpath = "/html/body/div[4]/div[7]/div/button") private WebElement fotpokbtn;

public void clickfpwd(){
    forgotpwd.click();
}
public String getforgotpwdtitle(){
    return Forgotpwdtitle.getText();
}
public void entervalidphno(String mob){
    fphoneno.sendKeys(mob);
}
public void clickresetpwd(){
    resetpwdbtn.click();
}
public void enterfotp(String otp){
    fotp.sendKeys(otp);
}
public String getfotptitle(){
   return fotptitle.getText();
}
public void clickfotpokbtn(){
    fotpokbtn.click();
}
}