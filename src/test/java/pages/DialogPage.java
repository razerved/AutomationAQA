package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DialogPage extends BasePage{
    // Блок описания локаторов для элементов
    private final By formElementLocator = By.xpath("//div[contains(@class, 'content-header-title') and contains(text(), 'All Projects')]");
    private final By headerTitleLabelLocator = By.xpath("//div[contains(@class, 'content-header-title') and contains(text(), 'All Projects')]");

    // Блок инициализации
    public DialogPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return formElementLocator;
    }

    // Блок атомарных методов
    private WebElement getFormElement() {
        return waitService.waitForExists(formElementLocator);
    }

    public WebElement getHeaderTitle() {
        return getFormElement().findElement(headerTitleLabelLocator);
    }
}
