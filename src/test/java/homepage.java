import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class homepage extends base {
    Landingpageele landingpageele;
    public homepage() {
        super();
    }
    @BeforeMethod
    public void setUp() throws InterruptedException {
        initialization();
        landingpageele=new Landingpageele();
    }

    @Test
    public void checkvalidlogin() throws InterruptedException {
      landingpageele.clickloginnav();
      landingpageele.entermobno("9962375973");
      landingpageele.enterpassword("abc123");
      landingpageele.clicklogin();
        Thread.sleep(20000);
      Assert.assertEquals(driver.getCurrentUrl(),"https://neet.m-tutor.com/home.php");
      Thread.sleep(20000);
  }
  @Test
    public void checkinvalidlogin() throws InterruptedException {
      landingpageele.clickloginnav();
      landingpageele.entermobno("666667654");
      landingpageele.enterpassword("abc43");
      landingpageele.clicklogin();
      Assert.assertEquals(landingpageele.getmobfielderr(),"Mobile Number looks incorrect");
  }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
