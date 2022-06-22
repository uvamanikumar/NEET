import Pageobject.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Changepwd extends Base {
    public Changepwd(){
        PageFactory.initElements(Base.driver,this);
    }

    @FindBy(xpath = "/html/body/div[2]/header/div[1]/nav/div/div[1]/div[1]/button/span")
    private WebElement Menubtn;
    @FindBy(xpath = "/html/body/div[2]/header/div[1]/nav/div/div[2]/ul/li[4]/a")
    private WebElement settingbtn;
    @FindBy(xpath = "//*[@id=\"home\"]/div/div/div/h4")
    private WebElement settingtitle;
    @FindBy(xpath = "//*[@id=\"reset-password\"]")
    private WebElement enterpwdfld;
    @FindBy(xpath = "//*[@id=\"reset-confirm-password\"]")
    private WebElement etrconfromfld;

    @FindBy(xpath = "//a[@id=\"reset_pwd_btn\"]")
    private WebElement changepwdbtn;
    @FindBy(xpath = "/html/body/div[5]/p")
    private WebElement successmsg;

    public void enternewpwd(String pwd){
        enterpwdfld.sendKeys(pwd);
    }
    public void enterconfrimpwd(String pwd){
        etrconfromfld.sendKeys(pwd);
    }
    public String getsuccessmsg(){
        return successmsg.getText();
    }
    public void clickChangepwdbtn(){
        changepwdbtn.click();
    }
    public void clickmenu() {
        Menubtn.click();
    }

    public void clicksetting() {
        settingbtn.click();
    }

    public String getsettingtitle() {
        return settingtitle.getText();
    }

}
