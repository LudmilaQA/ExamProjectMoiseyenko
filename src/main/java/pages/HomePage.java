package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class HomePage extends ParentPage {

    @FindBy(xpath = ".//*[@id='tiny-menu']/ul/li/a[text()=' Людмила Мойсеєнко']")
    private WebElement linkProfile;

    @FindBy(xpath = ".//*[@id='site-menu']/ul/li/a[text()='Женщинам']")
    private WebElement linkWoman;

    @FindBy (xpath = ".//a[@href='/orders']")
    private WebElement linkOrders;

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isLinkProfileDisplayed() {
 //             try {
//          WebElement linkProfile = webDriver.findElement(By.xpath(".//*[@id='tiny-menu']/ul/li/a[text()=' Людмила Мойсеєнко'"));
//          return linkProfile.isDisplayed();
//     } catch (Exception e) {
//     return false;
//       }


       return actionsWithOurElements.isLinkProfileDisplayed(linkProfile);
    }

    public void checkIsLinkProfileDisplayed() {
        Assert.assertTrue("Link profile is not displayed", isLinkProfileDisplayed());
    }

    public void clickOnLinkWoman() {
        actionsWithOurElements.clickOnElement(linkWoman);
    }

    public void clickOnLinkOrders() {
        actionsWithOurElements.clickOnElement(linkOrders);
    }
}
