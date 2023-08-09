package steps;

import baseEntities.BaseStep;
import models.User;
import models.UserBuilder;
import org.openqa.selenium.WebDriver;
import pages.DashboardPage;
import pages.LoginPage;

public class LoginStep extends BaseStep {


    public LoginStep(WebDriver driver) {
        super(driver);
    }

    public DashboardPage successLogin(String username, String psw) {
        loginPage.login(username, psw);

        return dashboardPage;
    }
    public DashboardPage successLoginSingleTone(User user) {
        loginPage.loginSingleTone(user);

        return dashboardPage;
    }


    public LoginPage negativeLogin(String username, String psw) {
        loginPage.login(username, psw);

        return loginPage;
    }



}
