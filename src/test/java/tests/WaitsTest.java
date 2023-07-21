package tests;

import baseEntities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import services.WaitService;

public class WaitsTest extends BaseTest {
    @Test
    public void presenceOfElementTest() {
        driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");

        WebElement button = driver.findElement(By.tagName("button"));
        button.click();
        Assert.assertFalse(button.isDisplayed());

        WebElement loading = driver.findElement(By.id("loading"));
        Assert.assertTrue(loading.isDisplayed());

        Assert.assertTrue(driver.findElement(By.id("finish")).isDisplayed());

    }

    @Test
    public void presenceOfElementWaitTest() {
        driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");
        WaitService waitService  = new WaitService(driver);

        WebElement button = waitService.waitForExists(By.tagName("button"));
        button.click();
        Assert.assertTrue(waitService.waitForElementInvisible(button));

        WebElement loading = waitService.waitForVisibilityLocatedBy(By.id("loading"));
        Assert.assertTrue(loading.isDisplayed());
        Assert.assertTrue(waitService.waitForElementInvisible(loading));

        Assert.assertTrue(waitService.waitForVisibilityLocatedBy(By.id("finish")).isDisplayed());

    }




}
