package steps;

import baseEntities.BaseStep;
import models.User;
import org.openqa.selenium.WebDriver;
import pages.DashboardPage;
import pages.LoginPage;

public class LoginStepPageFactory extends BaseStep {


    public LoginStepPageFactory(WebDriver driver) {
        super(driver);
    }

    public void successLoginPageFactory(String username, String psw) {
        loginPagePageFactory.loginPageFactory(username, psw);
    }




}
