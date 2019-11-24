package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class LoginPage extends ParentPage {
     @FindBy(id="loginLink")
     private WebElement linkVhod;

     @FindBy(name="LoginForm[login]")
     private WebElement inputLogin;

     @FindBy(xpath =". //*[@name='LoginForm[password]']")
     private WebElement inputPass;

     @FindBy(xpath =".//*[@name='login-button']")
     private WebElement buttonVoiti;



    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void openPage() {
        try {
            webDriver.get("https://garne.com.ua/");
        } catch (Exception e) {
            Assert.fail("Cannot work with browser");
        }
    }
    
    public void clickOnLinkVhod() {
//       WebElement linkVhod = webDriver.findElement(By.id("loginLink"));
//            linkVhod.click();
//            logger.info("Button was clicked");
        actionsWithOurElements.clickOnElement(linkVhod);
        }


    public void enterLoginInToInputLogin(String login) {
//        WebElement inputLogin = webDriver.findElement(By.name("LoginForm[login]"));
//        inputLogin.clear();
//        inputLogin.sendKeys(login);
//        logger.info(login + " was inputed in to input Login" );
        actionsWithOurElements.enterTextInToInput(inputLogin, login);
    }

    public void enterPassInToInputPassWord(String password) {
//        WebElement inputPass = webDriver.findElement(By.xpath(". //*[@name='LoginForm[password]'] "));
//        inputPass.clear();
//        inputPass.sendKeys(password);
//        logger.info(password + " was inputed into input PassWord");
        actionsWithOurElements.enterTextInToInput(inputPass, password);
    }

    public void clickOnButtonVoiti() {
//        WebElement buttonVoiti = webDriver.findElement(By.xpath(".//*[@name='login-button'] "));
//        buttonVoiti.click();
//        logger.info(" Button was clicked");
        actionsWithOurElements.clickOnElement(buttonVoiti);
    }
}

