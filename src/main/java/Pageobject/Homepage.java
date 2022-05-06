package Pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends Base {
    public Homepage(){
        PageFactory.initElements(Base.driver,this);
    }
    @FindBy(xpath = "/html/body/div[2]/header/div[1]/nav/div/div[1]/div[1]/button/span")
    private WebElement Menubtn;
    @FindBy(xpath = "/html/body/div[2]/header/div[1]/nav/div/div[2]/ul/li[4]/a")
    private WebElement settingbtn;
    @FindBy(xpath = "//*[@id=\"home\"]/div/div/div/h4")
    private WebElement settingtitle;
    @FindBy(xpath = "/html/body/div[2]/header/div[2]/div/div[3]/div/div/div/div[2]/a[1]/img")
    private WebElement googleplaybtn;
    @FindBy (xpath = "/html/body/div[2]/header/div[2]/div/div[3]/div/div/div/div[2]/a[2]/img")
    private WebElement appstorebtn;
    @FindBy(xpath ="/html/body/div[2]/section[4]/div/a/span[2]")
    private WebElement expertsondutybtn;
    @FindBy(xpath = "//*[@id=\"questionpanel\"]/h2")
    private WebElement expertsondutytitle;

    public void clickmenu() {
        Menubtn.click();
    }

    public void clicksetting() {
        settingbtn.click();
    }

    public String getsettingtitle() {
        return settingtitle.getText();
    }
    public void clickgoogleplay(){
        googleplaybtn.click();
    }
    public void clickappstore(){
        appstorebtn.click();
    }
    public void clickexpertsondutybtn(){
        expertsondutybtn.click();
    }
    public String getexpertsondutytitle(){
        return expertsondutytitle.getText();
    }
}