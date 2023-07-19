package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.configuration.ReadProperties;

public class TopMenuPage extends BasePage {
    private final By toPanelLocator = By.className("top-panel");

    public TopMenuPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return toPanelLocator;
    }

    public WebElement getTopPanel(){
        return driver.findElement(toPanelLocator);
    }
}
