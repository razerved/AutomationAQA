package homeWork.steps;

import homeWork.Page.FinishPageHW;
import homeWork.base.BaseStepsHW;
import org.openqa.selenium.WebDriver;

public class CheckoutStepsHW extends BaseStepsHW {
    public CheckoutStepsHW(WebDriver wd) {
        super(wd);
    }

    public FinishPageHW fillData(String name, String lastName, String zipCode){
        checkoutPage.getNameLocator().sendKeys(name);
        checkoutPage.getLastNameLocator().sendKeys(lastName);
        checkoutPage.getZipLocator().sendKeys(zipCode);
        checkoutPage.getContinueButtonLocator().click();
        return finishPage;
    }


}
