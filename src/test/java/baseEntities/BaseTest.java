package baseEntities;

import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import pages.DashboardPage;
import steps.LoginStep;
import steps.ProjectStep;
import utils.InvokedListener;
import utils.configuration.ReadProperties;
import org.apache.log4j.Logger;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;


@Listeners(InvokedListener.class)
//@Listeners(value = Listener.class)
public class BaseTest {
    protected LoginStep loginStep;
    protected ProjectStep projectStep;
    static Logger logger = Logger.getLogger(BaseTest.class);

    @BeforeMethod
    public void setUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

        org.apache.log4j.BasicConfigurator.configure();

        Configuration.baseUrl = ReadProperties.getUrl();
        Configuration.timeout = 8000;
        Configuration.browser = Browsers.FIREFOX;
        Configuration.browserSize = "1920x1080";
        //WebDriverRunner.getWebDriver().manage().window().maximize();
        //Configuration.fastSetValue = true; - быстрое вставление параметров ( не всегда работает )
        //Configuration.headless = false;
        //Configuration.assertionMode = SOFT;

        loginStep = new LoginStep();
        projectStep = new ProjectStep();

        open("/");

        logger.info("Browser is started");
    }

    @AfterMethod
    public void tearDown() {
        closeWebDriver();
    }

}
