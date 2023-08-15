package steps;

import baseEntities.BaseStep;
import models.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.DashboardPage;
import pages.LoginPage;

public class LoginStep extends BaseStep {
    Logger logger = LogManager.getLogger(LoginPage.class);

    public LoginStep(WebDriver driver) {
        super(driver);
    }

    public DashboardPage successLogin(String username, String psw) {
        loginPage.login(username, psw);
        logger.info("Use method login " + username + " " + psw );

        return dashboardPage;
    }

    public LoginPage negativeLogin(String username, String psw) {
        loginPage.login(username, psw);

        return loginPage;
    }

    public DashboardPage successLogin(User user) {
        loginPage.login(user);

        return dashboardPage;
    }



}
