package baseEntities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import steps.LoginStep;
import utils.configuration.ReadProperties;

public abstract class BasePage {
    protected WebDriver driver;



    public BasePage(WebDriver driver) {
        this.driver = driver;
    }


    public void openPageByUrl(String pagePath) {
        driver.get(ReadProperties.getUrl() + pagePath);


    }

    protected abstract By getPageIdentifier();
    public boolean isPageOpened(){
        return driver.findElement(getPageIdentifier()).isDisplayed();
    }


}
