package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class WomanPage extends ParentPage {

    @FindBy(xpath = ".//a[@href = '/catalog/woman/sort=3']")
    private WebElement sortSubMenu;

    @FindBy(id= "dropdownSortMenu")
    private WebElement clickOnButtonDD;

    @FindBy (xpath = "//*[@ class='iconfont-heart-empty']")
    private WebElement clickOnButtonHeart;

    @FindBy (xpath = ".//a[@href='/favorites']")
    private WebElement favouriteProfile;

    @FindBy (xpath = "//*[@data-original-title='Удалить из избранного']")
    private WebElement clickOnButtonFullHeart;

    @FindBy (xpath = ".//a[@class='logo']")
    private WebElement clickOnLogoGarne;


    public WomanPage(WebDriver webDriver) {
        super(webDriver);
    }


    public void clickOnHighToLowPrice() {
        actionsWithOurElements.clickOnElement(sortSubMenu);
    }


    public boolean isSortUrlDisplayed(String s) {
        return true;
    }

    public void clickOnButtonDD() {
        actionsWithOurElements.clickOnElement(clickOnButtonDD);
    }

    public void clickOnButtonHeart() {
        actionsWithOurElements.clickOnElement(clickOnButtonHeart);
    }

    public boolean isLinkFavouritesDisplayed() {
       actionsWithOurElements.isFavouritesDisplayed(favouriteProfile);
        return true;
    }

    public void deleteFromFavouriresAfterAdding() {
        actionsWithOurElements.clickOnElement(clickOnButtonFullHeart);
    }

    public void checkIsLinkFavouritesDisplayed() {
        Assert.assertTrue("Link profile is not displayed", isLinkFavouritesDisplayed());
    }

    public void clickOnLogoGarne() {
        actionsWithOurElements.clickOnElement(clickOnLogoGarne);
    }
}


