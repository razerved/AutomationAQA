package homeWork.steps;

import homeWork.Page.BasketPage;
import homeWork.base.BaseSteps;

public class ProductsSteps extends BaseSteps {


    public ProductsSteps() {
        super();
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
