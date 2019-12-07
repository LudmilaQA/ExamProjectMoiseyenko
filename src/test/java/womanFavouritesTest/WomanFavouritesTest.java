package womanFavouritesTest;

import abstractParentTest.AbstractParentTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class WomanFavouritesTest extends AbstractParentTest {
    @Test
    public void addToFavourites() {
        loginPage.fillingLoginFormAndSubmitIt("Linda2007@ukr.net", "1234luda");

        homePage.checkIsLinkProfileDisplayed();
        homePage.clickOnLinkWoman();

//        womanPage.clickOnFirstElement();
        womanPage.clickOnButtonHeart();
        checkExpectedResult("Link favourites is present with number", womanPage.isLinkFavouritesDisplayed() );
    }
    @After
    public void deleteFromFavourites () {
        womanPage.deleteFromFavouriresAfterAdding();
        womanPage.clickOnLogoGarne();
        womanPage.checkIsLinkFavouritesDisplayed();

    }
}
