import factory.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.configuration.ReadProperties;

import static org.testng.Assert.*;

public class HomeWork {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        BrowserFactory browserFactory = new BrowserFactory();
        driver = browserFactory.getDriver();
        driver.get(ReadProperties.getUrl());
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void baseLocate() {
        assertTrue(driver.findElement(By.id("name")).isDisplayed());
        assertTrue(driver.findElement(By.className("logo-loginpage")).isDisplayed());

        LogInAndClickAddProject();

        assertTrue(driver.findElement(By.linkText("Projects")).isDisplayed());
        assertTrue(driver.findElement(By.partialLinkText("Overview")).isDisplayed());

    }

    @Test
    public void cssLocate() {
        LogInAndClickAddProject();

        assertTrue(driver.findElement(By.cssSelector("#suite_mode_single_baseline")).isDisplayed());
        assertTrue(driver.findElement(By.cssSelector(".save-cancel-button")).isDisplayed());
        assertEquals(4, driver.findElements(By.cssSelector("label > strong")).size());
        assertEquals(2, driver.findElements(By.cssSelector("div ~ p")).size());
        assertEquals(3, driver.findElements(By.cssSelector("[title]")).size());
        assertTrue(driver.findElement(By.cssSelector("[name ='announcement']")).isDisplayed());
        assertTrue(driver.findElement(By.cssSelector("[id$='iption']")).isDisplayed());
        assertTrue(driver.findElement(By.cssSelector("[id^='adm']")).isDisplayed());
        assertTrue(driver.findElement(By.cssSelector("[name='suite_mode']:checked")).isDisplayed());

    }


    @Test
    public void xpathLocate() {
        LogInAndClickAddProject();
        assertTrue(driver.findElement(By.xpath("//*[@id ='search_query']")).isDisplayed());
        assertTrue( driver.findElement(By.xpath("//li/parent::ul[@class='top-menu pull-right']"))
                .isDisplayed());
        assertTrue(driver.findElement(By.xpath("//ul[@class='top-menu pull-right']/child::li[1]"))
                .isDisplayed());
        assertTrue( driver.findElement(By
                .xpath("//div[@class='sidebar-inner']/following::ul[@class='sidebar-menu']"))
                .isDisplayed());
        assertTrue(driver.findElement(By.xpath("//div[@class='sidebar-inner']/following-sibling::ul"))
                .isDisplayed());
    }

    private void LogInAndClickAddProject() {
        driver.findElement(By.id("name")).sendKeys(ReadProperties.username());
        driver.findElement(By.name("password")).sendKeys(ReadProperties.password());
        driver.findElement(By.tagName("button")).click();
        driver.findElement(By.id("navigation-empty-addproject")).click();
    }


}
