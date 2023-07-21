package tests;

import baseEntities.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import services.WaitService;
public class FrameTests extends BaseTest {
    @Test
    public void frameTest() {
        driver.get("http://the-internet.herokuapp.com/iframe");
        WaitService waitService = new WaitService(driver);
/*
        driver.switchTo().frame(driver.findElement(By.id("mce_0_ifr")));
        driver.switchTo().frame(0);
 */
        driver.switchTo().frame("mce_0_ifr");

        Assert.assertTrue(waitService.waitForVisibilityLocatedBy(By.id("tinymce")).isDisplayed());

        driver.switchTo().parentFrame();
        Assert.assertTrue(driver.findElement(By.className("tox-editor-container")).isDisplayed());
    }

}
