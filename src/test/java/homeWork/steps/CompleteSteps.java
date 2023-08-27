package homeWork.steps;

import homeWork.Page.ProductsPage;
import homeWork.base.BaseSteps;
import org.openqa.selenium.WebDriver;

public class CompleteSteps extends BaseSteps {
    public CompleteSteps(WebDriver wd) {
        super(wd);
    }

    public ProductsPage clickBackHomeButton(){
        completePage.getBackHomeButtonLocator().click();
        return productPage;
    }
}
