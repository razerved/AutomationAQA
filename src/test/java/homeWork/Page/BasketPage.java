package homeWork.Page;

import homeWork.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasketPage extends BasePage {
    private final String path = "/inventory.html";

    private final By buttonCheckoutLocator = By.id("checkout");



    public BasketPage(WebDriver wd) {
        super(wd);
    }

    @Override
    protected By getPageIdentifier() {
        return buttonCheckoutLocator;
    }


    public WebElement getButtonCheckoutLocator() {
        return wd.findElement(buttonCheckoutLocator);
    }




}
