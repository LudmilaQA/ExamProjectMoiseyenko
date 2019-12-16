package womanTest;

import abstractParentTest.AbstractParentTest;
import org.junit.After;
import org.junit.Test;

public class WomanTest extends AbstractParentTest {
    @Test
    public void sortingGoods() {
        loginPage.fillingLoginFormAndSubmitIt("Linda2007@ukr.net", "1234luda");

        homePage.checkIsLinkProfileDisplayed();
        homePage.clickOnLinkWoman();

        womanPage.clickOnButtonDD();
        womanPage.clickOnHighToLowPrice();

        checkExpectedResult("Cannot find sort submenu", womanPage.isSortUrlDisplayed("https://garne.com.ua/catalog/woman/sort=3"));
    }

}

