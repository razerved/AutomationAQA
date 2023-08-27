package homeWork.steps;

import homeWork.Page.FinishPage;
import homeWork.base.BaseSteps;
import org.openqa.selenium.WebDriver;

public class CheckoutSteps extends BaseSteps {
    public CheckoutSteps(WebDriver wd) {
        super(wd);
    }

    public FinishPage fillData(String name, String lastName, String zipCode){
        checkoutPage.getNameLocator().sendKeys(name);
        checkoutPage.getLastNameLocator().sendKeys(lastName);
        checkoutPage.getZipLocator().sendKeys(zipCode);
        checkoutPage.getContinueButtonLocator().click();
        return finishPage;
    }


}
