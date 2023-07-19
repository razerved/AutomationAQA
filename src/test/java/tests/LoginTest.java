package tests;

import baseEntities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.configuration.ReadProperties;

public class LoginTest extends BaseTest {


    @Test
    public void successLoginTest(){
        Assert.assertTrue(
        loginStep.successLogin(ReadProperties.username(),ReadProperties.password())
                .isPageOpened()
        );
    }
    @Test
    public void incorrectEmailLoginTest() {
        Assert.assertEquals(
                loginStep.negativeLogin("assd", ReadProperties.password()).getErrorTextLocator().getText(),
                "Email/Login or Password is incorrect. Please try again."
        );
    }
    @Test
    public void incorrectPswLoginTest() {
        Assert.assertEquals(
                loginStep.negativeLogin(ReadProperties.username(), "123456").getErrorTextLocator().getText(),
                "Email/Login or Password is incorrect. Please try again.",
                "Неверное сообщение об ошибке");
    }

    @Test
    public void shortPswLoginTest() {
        Assert.assertEquals(
                loginStep.negativeLogin(ReadProperties.username(), "123").getErrorFieldTextLocator().getText(),
                "Password is too short (5 characters required).",
                "Неверное сообщение об ошибке");
    }


}
