package homeWork.steps;

import homeWork.Page.BasketPage;
import homeWork.base.BaseSteps;
import org.openqa.selenium.WebDriver;

public class ProductsSteps extends BaseSteps {


    public ProductsSteps(WebDriver wd) {
        super(wd);
    }



    public void choseSomeGood(int goods, int button){
        productPage.getGoodsLocator().get(goods).click();
        productPage.getButtonLocator().get(button).click();
    }


    public BasketPage clickGoodsButtonAdd(int button){
        productPage.getButtonLocator().get(button).click();
        productPage.getBasketLocator().click();
        return basketPage;
    }


}
