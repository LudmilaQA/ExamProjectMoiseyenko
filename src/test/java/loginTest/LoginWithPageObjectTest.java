package loginTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Test;

public class LoginWithPageObjectTest extends AbstractParentTest {
    @Test
    public void ValidLogin () {
        loginPage.openPage();
        loginPage.clickOnLinkVhod();
        loginPage.enterLoginInToInputLogin("Linda2007@ukr.net");
        loginPage.enterPassInToInputPassWord("1234luda");
        loginPage.clickOnButtonVoiti();
        checkExpectedResult("Link profile is  present", homePage.isLinkProfileDisplayed ());
    }

    @Test
    public void UnValidLogin () {
        loginPage.openPage();
        loginPage.clickOnLinkVhod();
        loginPage.enterLoginInToInputLogin("Linda200777@ukr.net");
        loginPage.enterPassInToInputPassWord("1234luda");
        loginPage.clickOnButtonVoiti();
        checkExpectedResult("Link profile shouldn't be  present", !homePage.isLinkProfileDisplayed ());
    }

    @Test
    public void UpperCaseLogin () {
        loginPage.openPage();
        loginPage.clickOnLinkVhod();
        loginPage.enterLoginInToInputLogin("LINDA2007@UKR.NET");
        loginPage.enterPassInToInputPassWord("1234luda");
        loginPage.clickOnButtonVoiti();
        checkExpectedResult("Link profile is  present", homePage.isLinkProfileDisplayed ());
    }

}
