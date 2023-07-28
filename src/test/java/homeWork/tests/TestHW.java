package homeWork.tests;

import homeWork.base.BaseTestHW;
import io.qameta.allure.*;
import org.testng.Assert;

import org.testng.annotations.Test;
import utils.configuration.ReadProperties;

import static org.testng.Assert.*;
@Epic("Buy GoodGoods")
public class TestHW extends BaseTestHW {

    @Test(description = "Положительный тест авторизации")
    @Story("AQA21-5678")
    @Description("Positive login test")
    public void test1(){
        assertTrue(
                loginStep.successLogin(ReadProperties.username()
                        ,ReadProperties.password()).isPageOpen()
        );
    }

    @Test(description = "Негативный тест авторизации")
    @Description("Negative login test")
    @Issue("BUG-3321")
    public void test2(){
        assertTrue(
                loginStep.negativeLogin("парам"
                        ,"123123").equals(false)
        );
    }


    @Test(description = "End2End полный путь клиента")
    @Feature("End2End")
    @TmsLink("TestCase-20")
    @Description("buy SomeGoods Test")
    public void test3(){
        assertTrue(loginStep.successLogin(ReadProperties.username(),
                ReadProperties.password()).isPageOpen());
        assertTrue(productsSteps.clickGoodsButtonAdd(1).isPageOpen());
        assertTrue(basketStep.clickCheckout().isPageOpen());
        assertTrue(checkoutStep.fillData("Han", "Solo", "12345").isPageOpen());
        assertTrue(finishSteps.clickButtonFinishPage().isPageOpen());
        assertTrue(completeSteps.clickBackHomeButton().isPageOpen());
    }


}