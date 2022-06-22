import Pageobject.Base;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuesPage extends Base {
    public QuesPage(){
        PageFactory.initElements(Base.driver,this);
    }
    public WebElement Quespage (String Testmode){
        WebElement w=driver.findElement(By.xpath("//a[normalize-space()='"+Testmode+"']"));
        return w;
    }
    @FindBy(xpath = "//button[@id=\"myBtn\"]")
    public WebElement Submitbtn;
    @FindBy(xpath = "//button[@id=\"skipbtn\"]")
    private WebElement Skipbtn;
    @FindBy(xpath = "//button[@id=\"nextbtn\"]")
    private WebElement Nextbtn;
    @FindBy(xpath ="//input[@class=\"options_1 radio-custom\"]")
    private WebElement opt1;
    @FindBy(xpath = "//input[@class=\"options_2 radio-custom\"]")
    private WebElement opt2;
    @FindBy(xpath ="//button[@class=\"btn btn-outline btn-block disabled\"]")
    private WebElement totalQuesCount;
    @FindBy(xpath = "//button[@class=\"btn btn-outline btn-block disabled\"]/child::span")
    private WebElement currentquesNo;

    public void clickSubmitbtn() {
        Submitbtn.click();
    }
    public void ClickSkipbtn(){
        Skipbtn.click();
    }
    public void ClickNxtbtn(){
        Nextbtn.click();
    }
    public void clickopt1(){
        opt1.click();
    }
    public void clickopt2(){
        opt1.click();
    }
    public String gettotalquescount(){
        String t= totalQuesCount.getText();
        String s= StringUtils.substringAfter(t,"/");
        return s;
    }
    public String getcurrentquesNo(){
        return currentquesNo.getText();
    }
}
