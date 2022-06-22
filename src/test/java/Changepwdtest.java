import Pageobject.Base;
import Pageobject.Homepage;
import Pageobject.Landingpageele;
import Pageobject.Utility;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Changepwdtest extends Base {
    Changepwd changepwd;
    Landingpageele landingpageele;
    Utility utility;
    Homepage homepage;

    public Changepwdtest() {
        super();
    }

    @BeforeMethod
    public void setUp() throws InterruptedException {
        initialization();
        changepwd = new Changepwd();
        landingpageele = new Landingpageele();
        utility = new Utility();
        homepage=new Homepage();
    }

    @Test
    public void checkvalidpwd() throws InterruptedException {
        utility.validlogin();
        homepage.clickmenu();
        homepage.clicksetting();
        changepwd.enternewpwd("abc1234");
        changepwd.enterconfrimpwd("abc1234");
        changepwd.clickChangepwdbtn();
        Assert.assertEquals(changepwd.getsuccessmsg(), "Password Reset Successfully..!");
        landingpageele.clicksessok();
    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}