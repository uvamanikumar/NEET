import Pageobject.Base;
import Pageobject.Landingpageele;
import Pageobject.Utility;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Landingpagetest extends Base {
    Landingpageele landingpageele;
    Utility utility;
    public Landingpagetest() {
        super();
    }
    @BeforeMethod
    public void setUp() throws InterruptedException {
        initialization();
        landingpageele=new Landingpageele();
        utility=new Utility();
    }

    @Test
    public void checkvalidlogin() throws InterruptedException {
    utility.validlogin();
  }
  @Test
    public void checkinvalidlogin() throws InterruptedException {
      landingpageele.clickloginnav();
      landingpageele.entermobno("666667654");
      landingpageele.enterpassword("abc43");
      landingpageele.clicklogin();
      Assert.assertEquals(landingpageele.getmobfielderr(),"Mobile Number looks incorrect");
  }
  @Test
  public void checkinvalidlogin1() throws InterruptedException
  {
      landingpageele.clickloginnav();
      landingpageele.entermobno("67565545");
      landingpageele.enterpassword("sdssd3");
      landingpageele.clicklogin();
      Assert.assertEquals(landingpageele.getmobfielderr(),"Mobile Number looks incorrect");
  }
  @Test
  public void chechinvalidlogin2() throws InterruptedException
  {
      landingpageele.clickloginnav();
      landingpageele.entermobno("1234567890");
      landingpageele.enterpassword("avcdesf");
      landingpageele.clicklogin();
      Assert.assertEquals(landingpageele.getpwdfielderr(),"Password is case sensitive, it should be within 5 -10 alphanumeric characters. No SPL characters allowed.");
  }
    @Test
    public void chechinvalidlogin3() throws InterruptedException
    {
        landingpageele.clickloginnav();
        landingpageele.entermobno("1234567890");
        landingpageele.enterpassword("12345");
        landingpageele.clicklogin();
        Assert.assertEquals(landingpageele.getpwdfielderr(),"Password is case sensitive, it should be within 5 -10 alphanumeric characters. No SPL characters allowed.");
    }
    @Test
    public void chechinvalidlogin4() throws InterruptedException
    {
        landingpageele.clickloginnav();
        landingpageele.entermobno("1234567890");
        landingpageele.enterpassword("avc2");
        landingpageele.clicklogin();
        Assert.assertEquals(landingpageele.getpwdfielderr(),"Password is case sensitive, it should be within 5 -10 alphanumeric characters. No SPL characters allowed.");
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
