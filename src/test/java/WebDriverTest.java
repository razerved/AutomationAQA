import factory.AdvancedDriver;
import factory.BrowserFactory;
import factory.SimpleDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class WebDriverTest {


    @Test
    public void simpleWebDriverTest() throws InterruptedException {
        SimpleDriver simpleDriver = new SimpleDriver();
        WebDriver driver = simpleDriver.getDriver();
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void advancedWebDriverTest() throws InterruptedException {
        AdvancedDriver advancedDriver = new AdvancedDriver();
        WebDriver driver = advancedDriver.getDriver();
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void browserFactoryTest() throws InterruptedException {
        BrowserFactory browserFactory = new BrowserFactory();
        WebDriver driver = browserFactory.getDriver();
        Thread.sleep(2000);
        driver.quit();
    }

}
