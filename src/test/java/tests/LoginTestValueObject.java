package tests;

import baseEntities.BaseTest;
import helper.DataHelper;
import models.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPageValueObject;
import utils.configuration.ReadProperties;

public class LoginTestValueObject extends BaseTest {



    @Test
    public void shortValueObject_1() {
        User user = new User();
        user.setEmail(ReadProperties.username());
        user.setPassword("123456");
        LoginPageValueObject loginPageValueObject = new LoginPageValueObject(driver);
        loginPageValueObject.loginValueObject(user);
        Assert.assertEquals(loginPageValueObject.getErrorTextLocator().getText(),"Email/Login or Password is incorrect. Please try again.",
                "Неверное сообщение об ошибке");
    }

    @Test
    public void shortValueObject_2() {
        LoginPageValueObject loginPageValueObject = new LoginPageValueObject(driver);
        loginPageValueObject.loginValueObject(DataHelper.getAdminUser());
        Assert.assertEquals(loginPageValueObject.getErrorTextLocator().getText(),"Email/Login or Password is incorrect. Please try again.",
                "Неверное сообщение об ошибке");

    }




}
