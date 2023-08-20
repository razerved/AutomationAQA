package homeWork.tests;

import homeWork.base.BaseTest;
import utils.configuration.ReadProperties;


public class Test extends BaseTest {

    @org.testng.annotations.Test
    public void loginTest() {

        loginStep.successLogin(ReadProperties.username()
                , ReadProperties.password()).isPageOpen();

    }

    @org.testng.annotations.Test
    public void bySomeGoodsTest() {
        loginStep.successLogin(ReadProperties.username(),
                ReadProperties.password()).isPageOpen();
        productsSteps.clickGoodsButtonAdd(1).isPageOpen();
        basketStep.clickCheckout().isPageOpen();
        checkoutStep.fillData("Han", "Solo", "12345").isPageOpen();
        finishSteps.clickButtonFinishPage().isPageOpen();
        completeSteps.clickBackHomeButton().isPageOpen();
    }


}