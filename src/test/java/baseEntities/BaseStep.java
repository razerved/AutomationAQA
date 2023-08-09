package baseEntities;

import org.openqa.selenium.WebDriver;
import pages.DashboardPage;
import pages.LoginPage;
import pages.LoginPagePageFactory;

public class BaseStep {
    protected WebDriver driver;

    protected LoginPage loginPage;
    protected LoginPagePageFactory loginPagePageFactory;
    protected DashboardPage dashboardPage;

    public BaseStep(WebDriver driver) {
        this.driver = driver;
        this.loginPagePageFactory = new LoginPagePageFactory(driver);
    }


}
