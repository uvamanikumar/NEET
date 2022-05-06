package Pageobject;

import Pageobject.Landingpageele;
import org.testng.Assert;

public class Utility extends Base{
    Landingpageele landingpageele;
    public void validlogin() throws InterruptedException {
        landingpageele=new Landingpageele();
        landingpageele.clickloginnav();
        landingpageele.entermobno("9962375973");
        landingpageele.enterpassword("abc123");
        landingpageele.clicklogin();
        Thread.sleep(10000);
        try{
            landingpageele.clicksessok();
        }catch (Exception e){
            System.out.println("element not found");
        }
        Thread.sleep(10000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://neet.m-tutor.com/home.php");
        Thread.sleep(10000);
    }
}
