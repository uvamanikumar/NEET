import Pageobject.Base;
import Pageobject.Forgotpwd;
import Pageobject.Landingpageele;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Forgotpwdtest extends Base {
    Forgotpwd forgotpwd;
    Landingpageele landingpageele;
    public Forgotpwdtest(){
        super();
    }
    @BeforeMethod
    public void setUp() throws InterruptedException {
        initialization();
        forgotpwd =new Forgotpwd();
        landingpageele=new Landingpageele();
    }
    @Test
    public void checkforgotpwd() {
        landingpageele.clickloginnav();
        forgotpwd.clickfpwd();
        Assert.assertTrue(forgotpwd.getforgotpwdtitle().contains("Forgot your Password?"));

    }
    @Test
    public void checkfotppage() {
        landingpageele.clickloginnav();
        forgotpwd.clickfpwd();
        Assert.assertTrue(forgotpwd.getforgotpwdtitle().contains("Forgot your Password?"));
        forgotpwd.entervalidphno("8667651940");
        forgotpwd.clickresetpwd();
        forgotpwd.clickfotpokbtn();
        Assert.assertTrue(forgotpwd.getfotptitle().contains("Enter OTP! Give us a minute…"));

    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
