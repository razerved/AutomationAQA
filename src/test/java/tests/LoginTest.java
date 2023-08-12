package tests;

import baseEntities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.configuration.ReadProperties;

public class LoginTest extends BaseTest {


    @Test
    public void successLoginTest() {
        Assert.assertTrue(
                loginStep.successLogin(ReadProperties.username(), ReadProperties.password())
                        .isPageOpened()
        );
    }

}
