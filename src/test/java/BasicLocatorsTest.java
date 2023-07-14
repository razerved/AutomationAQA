import factory.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.configuration.ReadProperties;

public class BasicLocatorsTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        BrowserFactory browserFactory = new BrowserFactory();
        driver = browserFactory.getDriver();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void basicLocatorsTest_1() {
        driver.get(ReadProperties.getUrl());

        // Find webElement by ID
        driver.findElement(By.id("name")).sendKeys(ReadProperties.username());

        // Find webElement by Name
        driver.findElement(By.name("password")).sendKeys(ReadProperties.password());

        // Find webElement by Tag
        driver.findElement(By.tagName("button")).click();
    }

    @Test
    public void basicLocatorsTest_2() {
        driver.get(ReadProperties.getUrl());

        // Find webElement by LinkText
        driver.findElement(By.linkText("Forgot your password?")).click();

        // Find webElement by ClassName
        driver.findElement(By.className("forgot_passwordpage-request-cancel")).click();

        // Find webElement by PartialLinkText
        driver.findElement(By.partialLinkText("your password?")).click();
    }


}
