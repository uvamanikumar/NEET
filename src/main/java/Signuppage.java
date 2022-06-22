import Pageobject.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signuppage extends Base{
    public Signuppage(){
        PageFactory.initElements(Base.driver, this);
    }
    @FindBy(xpath = "/html/body/div[2]/div/div/ul/li[2]/a")
    private WebElement newaccbtn;
    @FindBy(xpath = "//*[@id=\"signup-username\"]")
    private WebElement signupusername;
    @FindBy(xpath = "//*[@id=\"signup-mobile_no\"]")
    private WebElement signupmobfield;
    @FindBy(xpath = "//*[@id=\"signup-password\"]")
    private WebElement signuppwdfield;
    @FindBy(xpath = "//*[@id=\"cd-signup\"]/form/p[4]/input")
    private WebElement createaccbtn;
    @FindBy(xpath = "//*[@id=\"accept-terms\"]")
    private WebElement tickcheckbox;
    @FindBy(xpath = "/html/body/div[4]/p")
    private WebElement signupotp;
    public void newaccbtnnav(){
        newaccbtn.click();
    }

    public void enterusername(String sname){
        signupusername.sendKeys("uva");
    }
    public void entermobno(String smob){
        signupmobfield.sendKeys("9940286899");
    }
    public void entersignuppwd(String spwd){
        signuppwdfield.sendKeys("abc12");
    }
    public void tickcheck(){tickcheckbox.click();}
    public void clickcreateaccbtn(){
        createaccbtn.click();
    }

    public String getotptitle() {
        return signupotp.getText();
    }
}
