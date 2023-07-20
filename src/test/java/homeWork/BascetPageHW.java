package homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BascetPageHW extends BasePageHW {
    private final String path = "https://www.saucedemo.com/inventory.html";

    private final By buttonCheckoutLocator = By.id("checkout");



    public BascetPageHW(WebDriver wd) {
        super(wd);
    }

    @Override
    protected By getPageIdentifier() {
        return buttonCheckoutLocator;
    }


    public WebElement getButtonCheckoutLocator() {
        return wd.findElement(buttonCheckoutLocator);
    }

    public CheckoutPageHW clickCheckout(){
        getButtonCheckoutLocator().click();
        return new CheckoutPageHW(wd);
    }


}
