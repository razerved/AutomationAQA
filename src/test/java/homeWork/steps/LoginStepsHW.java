package homeWork.steps;

import homeWork.Page.LoginPageHW;
import homeWork.Page.ProductsPageHW;
import homeWork.base.BaseStepsHW;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class LoginStepsHW extends BaseStepsHW {


    public LoginStepsHW(WebDriver wd) {
        super(wd);
    }


    @Step
    public ProductsPageHW successLogin(String name, String password){
        loginPage.login(name,password);
        return productPage;
    }
    @Step
    public LoginPageHW negativeLogin(String name, String password){
        loginPage.login(name,password);
        return loginPage;
    }


}
