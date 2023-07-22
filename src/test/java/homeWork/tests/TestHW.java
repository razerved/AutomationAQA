package homeWork.tests;

import homeWork.base.BaseTestHW;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.configuration.ReadProperties;

public class TestHW extends BaseTestHW {

    @Test
    public void loginTest(){
        Assert.assertTrue(
                loginStep.successLogin(ReadProperties.username()
                        ,ReadProperties.password()).isPageOpen()
        );
    }

    @Test
    public void bySomeGoodsTest(){
        Assert.assertTrue(loginStep.successLogin(ReadProperties.username(),
                ReadProperties.password()).isPageOpen());
        productsStepsHW.clickGoodsButtonAdd(1).isPageOpen();
        basketStep.clickCheckout().isPageOpen();
                /*.clickCheckout()
                .fillData("Obi", "Van", "deathStar")
                .clickButtonFinishPage()
                .clickBackHomeButton();*/
    }

    @Test
    public void tut(){

    }

}