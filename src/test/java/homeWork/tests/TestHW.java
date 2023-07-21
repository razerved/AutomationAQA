package homeWork.tests;

import homeWork.base.BaseTestHW;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.configuration.ReadProperties;

import static org.testng.Assert.*;

public class TestHW extends BaseTestHW {

    @Test
    public void loginTest(){
        assertTrue(
                loginStep.successLogin(ReadProperties.username()
                        ,ReadProperties.password()).isPageOpen()
        );
    }

    @Test
    public void bySomeGoodsTest(){
        assertTrue(loginStep.successLogin(ReadProperties.username(),
                ReadProperties.password()).isPageOpen());
        assertTrue(productsSteps.clickGoodsButtonAdd(1).isPageOpen());
        assertTrue(basketStep.clickCheckout().isPageOpen());
        assertTrue(checkoutStep.fillData("Han", "Solo", "12345").isPageOpen());
        assertTrue(finishSteps.clickButtonFinishPage().isPageOpen());
        assertTrue(completeSteps.clickBackHomeButton().isPageOpen());
    }


}