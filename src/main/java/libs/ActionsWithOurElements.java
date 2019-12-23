package libs;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActionsWithOurElements {
    WebDriver webDriver;
    Logger logger = Logger.getLogger(getClass());

    public ActionsWithOurElements(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void enterTextInToInput(WebElement webElement, String text) {
        try {
            webElement.clear();
            webElement.sendKeys(text);
            logger.info(text + " was inputted into input");
        } catch (Exception e) {
            stopTestAndPrintMessage();
        }
    }

    public void clickOnElement(WebElement webElement) {
        try {
            webElement.click();
            logger.info(" Element was clicked");
        } catch (Exception e) {
            stopTestAndPrintMessage();
        }
    }

        public boolean isLinkProfileDisplayed (WebElement webElement) {
            try {
                boolean state = webElement.isDisplayed();
                logger.info("Is link profile displayed -> " + state);
                return state;

            } catch (Exception e) {
                logger.info("Is link profile displayed -> false");
                return false;
            }
        }
public String getCurrentUrl() {
        return webDriver.getCurrentUrl();
}
    public boolean isLinkDisplayed(WebElement webElement) {
        try {
            boolean state = webElement.isDisplayed();
            logger.info("Is link displayed -> " + state);
            return state;

        } catch (Exception e) {
            logger.info("Is link displayed -> false");
            return false;
        }
    }

    private void stopTestAndPrintMessage() {
        logger.error("Cannot work with element ");
        Assert.fail("Cannot work with element ");
    }

    public boolean isFavouritesDisplayed(WebElement webElement) {
        try {
            boolean state = webElement.isDisplayed();
            logger.info("Is link favourites displayed -> true");
            return true;

        } catch (Exception e) {
            logger.info("Is link favourites displayed -> false");
            return false;
        }
    }

}


