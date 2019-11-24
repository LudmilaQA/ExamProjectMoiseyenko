package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class HomePage extends ParentPage {

    @FindBy(xpath = ".//*[@id='tiny-menu']/ul/li/a[text()=' Людмила Мойсеєнко']")
    private WebElement linkProfile;

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isLinkProfileDisplayed() {
        //       try {
//           WebElement linkProfile = webDriver.findElement(By.xpath(".//*[@id='tiny-menu']/ul/li/a[text()=' Людмила Мойсеєнко']"));
//           return linkProfile.isDisplayed();
//      } catch (Exception e) {
//      return false;
//        }
        return actionsWithOurElements.isLinkProfileDisplayed(linkProfile);
    }
}
