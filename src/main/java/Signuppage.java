import Pageobject.Base;
import net.sf.cglib.proxy.Factory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signuppage extends Base{
    public Signuppage(){
        PageFactory.initElements(Base.driver, this);
    }
    @FindBy(xpath = "//*[@id=\"signup-username\"]")
    private WebElement username;
    public void enterusername
}
