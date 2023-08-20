package homeWork.steps;

import homeWork.Page.ProductsPage;
import homeWork.base.BaseSteps;

public class CompleteSteps extends BaseSteps {
    public CompleteSteps() {
        super();
    }

    public ProductsPage clickBackHomeButton(){
        completePage.getBackHomeButtonLocator().click();
        return productPage;
    }
}
