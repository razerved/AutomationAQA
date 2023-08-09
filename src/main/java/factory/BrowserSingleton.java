package factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public final class BrowserSingleton {
    private static BrowserSingleton instance;
    public WebDriver driver;

    private BrowserSingleton() {
        DriverManagerType driverManagerType = DriverManagerType.CHROME;
        WebDriverManager.chromedriver().driverVersion("114.0.5735.90").setup();

        driver = new ChromeDriver();
    }

    public static BrowserSingleton getInstance() {
        if (instance == null) {
            instance = new BrowserSingleton();
        }

        return instance;
    }
}