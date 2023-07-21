package homeWork.tests;

import homeWork.base.BaseTestHW;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.configuration.ReadProperties;

public class TestHW extends BaseTestHW {

    @Test
    public void loginTest(){
        Assert.assertTrue(
                getBaseStep().successLogin(ReadProperties.username()
                        ,ReadProperties.password()).isPageOpen()
        );
    }

    @Test
    public void bySomeGoodsTest(){
        getBaseStep().successLogin(ReadProperties.username(), ReadProperties.password())
                .clickGoodsButtonAdd(1)
                .clickCheckout()
                .fillData("Obi", "Van", "deathStar")
                .clickButtonFinishPage()
                .clickBackHomeButton();
    }


}