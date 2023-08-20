package homeWork.steps;

import homeWork.Page.FinishPage;
import homeWork.base.BaseSteps;

public class CheckoutSteps extends BaseSteps {
    public CheckoutSteps() {
        super();
    }

    public FinishPage fillData(String name, String lastName, String zipCode){
        checkoutPage.getNameLocator().sendKeys(name);
        checkoutPage.getLastNameLocator().sendKeys(lastName);
        checkoutPage.getZipLocator().sendKeys(zipCode);
        checkoutPage.getContinueButtonLocator().click();
        return finishPage;
    }


}
