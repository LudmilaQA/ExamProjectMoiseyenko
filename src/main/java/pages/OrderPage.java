package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class OrderPage extends ParentPage {

    @FindBy (xpath = ".//img[@src='/img/p/min/359/4400359a.jpg']")
    private WebElement image;

    @FindBy (xpath = "//*[@id='main-content']/div/div/section/section/h2")
    private WebElement orderHistory;

    public OrderPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickOnImage() {
        actionsWithOurElements.clickOnElement(image);
    }

    public boolean isOrderHistoryDisplayed() {
        try {
            WebElement orderHistory = webDriver.findElement(By.xpath("//*[@id='main-content']/div/div/section/section/h2"));
            return orderHistory.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
