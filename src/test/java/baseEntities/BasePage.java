package baseEntities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import services.WaitService;
import steps.LoginStep;
import utils.configuration.ReadProperties;

import java.time.Duration;

public abstract class BasePage {
    protected WebDriver driver;
    private static final int WAIT_FOR_PAGE_LOADED_IN_SECONDS = 30;


    public BasePage(WebDriver driver) {
        this.driver = driver;
    }


    public void openPageByUrl(String pagePath) {
        driver.get(ReadProperties.getUrl() + pagePath);

        //waitForOpen();
        waitForOpenNew();
    }


    protected abstract By getPageIdentifier();

    public boolean isPageOpened() {
        WaitService waitService = new WaitService(driver, Duration.ofSeconds(WAIT_FOR_PAGE_LOADED_IN_SECONDS));
        //return driver.findElement(getPageIdentifier()).isDisplayed();
        return waitService.waitForExists(getPageIdentifier()).isDisplayed();
    }

    protected void waitForOpen()  {
        int tryCount = 0;
        boolean isPageOpenedIndicator = isPageOpened();

        while (!isPageOpenedIndicator && tryCount < WAIT_FOR_PAGE_LOADED_IN_SECONDS) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            tryCount++;
            isPageOpenedIndicator = isPageOpened();
        }

        if (!isPageOpenedIndicator) {
            throw new AssertionError("Page was not loaded...");
        }
    }

    protected void waitForOpenNew()  {
        if (!isPageOpened()) {
            throw new AssertionError("Page was not loaded...");
        }
    }

}
