package Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Base {
    public static WebDriver driver;
    public static void initialization() throws InterruptedException {
          //  WebDriverManager.chromedriver().setup();
            System.setProperty("webdriver.chrome.driver","D:/Automation/Demo/src/main/resources/Drivers/chromedriver.exe");
           // Reporter.log("=====Browser Session Started=====", true);
            driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://neet.m-tutor.com/");
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS) ;
            //Reporter.log("=====Application Started=====", true);
        }
}
