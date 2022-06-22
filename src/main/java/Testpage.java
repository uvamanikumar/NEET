import Pageobject.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Testpage extends Base {
    public Testpage(){
        PageFactory.initElements(Base.driver, this);
    }
    public WebElement selecttest(String test){
        WebElement w=driver.findElement(By.xpath("//div[@class=\"card border-info shadow text-info p-3 my-card \"]/child::h3[text()='"+test+"']"));
        return w;
    }
    public WebElement selecttestmode(String Testmode){
        WebElement w=driver.findElement(By.xpath("//a[normalize-space()='"+Testmode+"']"));
        return w;
    }
}
