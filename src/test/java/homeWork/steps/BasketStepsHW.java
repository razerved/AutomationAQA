package homeWork.steps;

import homeWork.Page.CheckoutPageHW;
import homeWork.base.BaseStepsHW;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class BasketStepsHW extends BaseStepsHW {
    public BasketStepsHW(WebDriver wd) {
        super(wd);
    }

    @Step
    public CheckoutPageHW clickCheckout(){
        basketPage.getButtonCheckoutLocator().click();
        return checkoutPage;
    }

}
