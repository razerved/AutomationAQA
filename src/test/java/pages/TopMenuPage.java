package pages;

import baseEntities.BasePage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.configuration.ReadProperties;

import static com.codeborne.selenide.Selenide.$;

public class TopMenuPage extends BasePage {
    private final By toPanelLocator = By.className("top-panel");

    public TopMenuPage() {
        super();
    }

    @Override
    protected By getPageIdentifier() {
        return toPanelLocator;
    }

    public SelenideElement getTopPanel(){
        return $(toPanelLocator);
    }
}
