package homeWork.steps;

import homeWork.Page.BasketPageHW;
import homeWork.Page.LoginPageHW;
import homeWork.Page.ProductsPageHW;
import homeWork.base.BaseStepsHW;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class ProductsStepsHW extends BaseStepsHW {


    public ProductsStepsHW(WebDriver wd) {
        super(wd);
    }



    public void choseSomeGood(int goods, int button){
        productPage.getGoodsLocator().get(goods).click();
        productPage.getButtonLocator().get(button).click();
    }

    @Step
    public BasketPageHW clickGoodsButtonAdd(int button){
        productPage.getButtonLocator().get(button).click();
        productPage.getBasketLocator().click();
        return basketPage;
    }


}
