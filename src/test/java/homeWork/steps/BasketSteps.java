package homeWork.steps;

import homeWork.Page.CheckoutPage;
import homeWork.base.BaseSteps;

public class BasketSteps extends BaseSteps {
    public BasketSteps() {
        super();
    }

    public CheckoutPage clickCheckout(){
        basketPage.getButtonCheckoutLocator().click();
        return checkoutPage;
    }

}
