package steps;

import baseEntities.BaseStep;
import models.User;
import org.openqa.selenium.WebDriver;
import pages.DashboardPage;
import pages.LoginPage;

public class LoginStep extends BaseStep {


    public LoginStep() {
        super();
    }

    public DashboardPage successLogin(User user) {
        loginPage.login(user);

        return dashboardPage;
    }

    public DashboardPage successLogin(String user, String password) {
        loginPage.login(user, password);

        return dashboardPage;
    }

    public LoginPage negativeLogin(User user) {
        loginPage.login(user);

        return loginPage;
    }

    public LoginPage negativeLogin(String user, String password) {
        loginPage.login(user, password);

        return loginPage;
    }


}
