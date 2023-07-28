package homeWork.steps;

import homeWork.Page.ProductsPageHW;
import homeWork.base.BaseStepsHW;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class CompleteStepsHW extends BaseStepsHW {
    public CompleteStepsHW(WebDriver wd) {
        super(wd);
    }

    @Step
    public ProductsPageHW clickBackHomeButton(){
        completePage.getBackHomeButtonLocator().click();
        return productPage;
    }
}
