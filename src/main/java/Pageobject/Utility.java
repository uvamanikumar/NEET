package Pageobject;

import Pageobject.Landingpageele;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.*;

public class Utility extends Base{
    Landingpageele landingpageele;
    Homepage homepage;

    public void validlogin() throws InterruptedException {
        landingpageele=new Landingpageele();
        homepage=new Homepage();
        landingpageele.clickloginnav();
        Thread.sleep(2000);
        landingpageele.entermobno("9962375973");
        landingpageele.enterpassword("abc12");
        driver.manage().timeouts().implicitlyWait(30, SECONDS) ;
        landingpageele.clicklogin();
       Thread.sleep(2000);
        try{
            landingpageele.clicksessok();
            driver.manage().timeouts().implicitlyWait(30, SECONDS) ;
        }catch (Exception e){
            System.out.println("element not found");
        }
        driver.manage().timeouts().implicitlyWait(10, SECONDS) ;
        Assert.assertEquals(Homepage.getlogout(),"Logout");
        driver.manage().timeouts().implicitlyWait(10, SECONDS) ;
    }


    public void scrolltoelement(WebElement w) throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", w);
        Thread.sleep(500);
    }
}
