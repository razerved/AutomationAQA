package tests;

import factory.BrowserSingleton;
import helper.DataHelper;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import steps.LoginStep;

public class SingletoneTest {

    @Test
    public void testSingleTone(){
        WebDriver driver = BrowserSingleton.getInstance().driver;
        LoginStep loginStep = new LoginStep(driver);

        Assert.assertTrue(
                loginStep.successLoginSingleTone(DataHelper.getAdminUser())
                        .isPageOpened()
        );
    }

}
