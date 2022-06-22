import Pageobject.Base;
import Pageobject.Homepage;
import Pageobject.Landingpageele;
import Pageobject.Utility;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testpagetest extends Base {
    Testpage testpage;
    Landingpageele landingpageele;
    Utility utility;
    Homepage homepage;
    QuesPage quesPage;

    public Testpagetest() {
        super();
    }

    @BeforeMethod
    public void setUp() throws InterruptedException {
        initialization();
        testpage = new Testpage();
        landingpageele = new Landingpageele();
        utility = new Utility();
        homepage = new Homepage();
        quesPage = new QuesPage();
    }

    @Test
    public void checktest1() throws InterruptedException {
        utility.validlogin();
        homepage.selectsubject("Chemistry").click();
        Assert.assertTrue(driver.getCurrentUrl().contains("Chemistry"));
        Thread.sleep((5000));
        testpage.selecttest("T1").click();
        Assert.assertTrue(driver.getCurrentUrl().contains("Test+1"));
        Thread.sleep(2000);
        testpage.selecttestmode("Exam Mode").click();
        Assert.assertTrue(driver.getCurrentUrl().contains("mode=exam"));
        Thread.sleep(5000);
        System.out.println("uk Total: "+quesPage.gettotalquescount());
        System.out.println("Uk current: "+quesPage.getcurrentquesNo());
        int total=Integer.parseInt(quesPage.gettotalquescount());
        int curent=Integer.parseInt(quesPage.getcurrentquesNo());
        for (int i=1;i<=total;i++){
            quesPage.clickopt1();
            Thread.sleep(2000);
            quesPage.ClickNxtbtn();
            Thread.sleep(4000);
        }
        Assert.assertTrue(driver.getCurrentUrl().contains("assessment_result"));


//        quesPage.clickSubmitbtn();


    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
