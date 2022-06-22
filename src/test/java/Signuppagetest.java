import Pageobject.Base;
import Pageobject.Landingpageele;
import Pageobject.Utility;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.nio.charset.Charset;

public class Signuppagetest extends Base{
    Signuppage signuppage;
    Landingpageele landingpageele;

    public Signuppagetest() {
        super();
    }
    @BeforeMethod
    public void setUp() throws InterruptedException {
        initialization();
        signuppage=new Signuppage();
        landingpageele=new Landingpageele();
    }
    @Test
    public void Signup() throws InterruptedException{
        landingpageele.clickloginnav();
        signuppage.newaccbtnnav();
        signuppage.enterusername("uva");
        signuppage.entermobno("9940286899");
        signuppage.entersignuppwd("abc12");
        signuppage.tickcheck();
        signuppage.clickcreateaccbtn();
        Assert.assertEquals(signuppage.getotptitle(),"OTP Sent to Your Mobile Number");
    }



}