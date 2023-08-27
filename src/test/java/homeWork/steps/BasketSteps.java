package homeWork.steps;

import homeWork.Page.CheckoutPage;
import homeWork.base.BaseSteps;
import org.openqa.selenium.WebDriver;

public class BasketSteps extends BaseSteps {
    public BasketSteps(WebDriver wd) {
        super(wd);
    }

    public CheckoutPage clickCheckout(){
        basketPage.getButtonCheckoutLocator().click();
        return checkoutPage;
    }

}
