package tests;

import baseEntities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.configuration.ReadProperties;

public class LoginTestPageFactory extends BaseTest {


    @Test
    public void successLoginTestPageFactory(){
                loginStepPageFactory
                        .successLoginPageFactory
                                ("atrostyanko@gmail.com", "Qwertyu_1");


    }


}
