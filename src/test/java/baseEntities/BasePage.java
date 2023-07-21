package baseEntities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import services.WaitService;
import steps.LoginStep;
import utils.configuration.ReadProperties;

public abstract class BasePage {
    protected WebDriver driver;
    protected WaitService waitService;



    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.waitService = new WaitService(driver);
    }


    public void openPageByUrl(String pagePath) {
        driver.get(ReadProperties.getUrl() + pagePath);


    }

    protected abstract By getPageIdentifier();
    public boolean isPageOpened(){
        return driver.findElement(getPageIdentifier()).isDisplayed();
    }


}
