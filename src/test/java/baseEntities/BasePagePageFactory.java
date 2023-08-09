package baseEntities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import services.WaitService;
import utils.configuration.ReadProperties;

import java.time.Duration;

public abstract class BasePagePageFactory {
    protected WebDriver driver;
    protected WaitService waitService;

    public BasePagePageFactory(WebDriver driver) {
        this.driver = driver;
        this.waitService = new WaitService(driver);

        PageFactory.initElements(driver,this);
    }

    protected abstract By getPageIdentifier();
    public void openPageByUrl(String pagePath) {
        driver.get(ReadProperties.getUrl() + pagePath);
    }

    public boolean isPageOpened() {
        return driver.findElement(getPageIdentifier()).isDisplayed();
    }

    public void updateElements() {
        PageFactory.initElements(driver, this);
    }


}
