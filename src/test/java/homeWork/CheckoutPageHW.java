package homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPageHW extends BasePageHW {
    private final String  path = "/checkout-step-one.html";


    private final By nameLocator = By.id("first-name");
    private final By lastNameLocator = By.id("last-name");

    private final By continueLocator = By.id("#continue");


    public CheckoutPageHW(WebDriver wd) {
        super(wd);
    }

    @Override
    protected By getPageIdentifier() {
        return continueLocator;
    }




}
