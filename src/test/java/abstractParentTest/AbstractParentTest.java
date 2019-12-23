package abstractParentTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;
import pages.OrderPage;
import pages.WomanPage;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class AbstractParentTest {
  protected WebDriver webDriver;
  protected LoginPage loginPage;
  protected HomePage homePage;
  protected WomanPage womanPage;
  protected OrderPage orderPage;

    @Before
    public void setUp () {
        File file = new File("./src/drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        webDriver = new ChromeDriver();

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        loginPage = new LoginPage(webDriver);
        homePage = new HomePage(webDriver);
        womanPage = new WomanPage(webDriver);
        orderPage = new OrderPage(webDriver);

    }
     @After
    public void tearDown (){
        webDriver.quit();
     }

    protected void checkExpectedResult(String message, boolean actualResult) {
        Assert.assertEquals(message, true, actualResult);
    }

    protected void checkExpectedResult(String message, String actualResult, String expected) {
        Assert.assertEquals(message, expected, actualResult);
    }
}
