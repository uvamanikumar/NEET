import Pageobject.Base;
import Pageobject.Homepage;
import Pageobject.Landingpageele;
import Pageobject.Utility;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Homepagetest extends Base {
Homepage homepage;
Landingpageele landingpageele;
Utility utility;

public Homepagetest(){
    super();
}
    @BeforeMethod
    public void setUp() throws InterruptedException {
        initialization();
        homepage = new Homepage();
        landingpageele = new Landingpageele();
        utility=new Utility();
    }
    @Test
    public void checksociallinkbtn() throws InterruptedException {
    utility.validlogin();
    homepage.clickgoogleplay();
    Thread.sleep(5000);
    Assert.assertEquals(driver.getCurrentUrl(),"https://play.google.com/store/apps/details?id=com.MobileTutor.neet");
    homepage.clickappstore();
    Thread.sleep(5000);
    Assert.assertEquals(driver.getCurrentUrl(),"https://apps.apple.com/us/app/mneet/id1577408414");
    }
    @Test
   public void checkexpertonduty() throws InterruptedException {
    utility.validlogin();
    homepage.clickexpertsondutybtn();
    Assert.assertEquals(homepage.getexpertsondutytitle(),"Talk to our expert ?");
    }
    @Test
    public void checksettingpage() throws InterruptedException {
    utility.validlogin();
    homepage.clickmenu();
    homepage.clicksetting();
    Assert.assertTrue(homepage.getsettingtitle().contains("Change Your Pasword"));
  //  Assert.assertEquals("");
}
@Test
public void checkhome() throws InterruptedException{
    utility.validlogin();
    //Assert.assertEquals(homepage.getlogout(),"Logout");
}
@AfterMethod
public void tearDown(){
    driver.close();
}
}
