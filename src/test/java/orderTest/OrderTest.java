package orderTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Test;

public class OrderTest extends AbstractParentTest {


    @Test
    public void OrderHistory(){
        loginPage.fillingLoginFormAndSubmitIt("Linda2007@ukr.net", "1234luda");
//        homePage.checkIsLinkProfileDisplayed();
        homePage.clickOnLinkOrders();

        orderPage.clickOnImage();

        checkExpectedResult("Cannot find an image", orderPage.isOrderHistoryDisplayed());


    }
}
