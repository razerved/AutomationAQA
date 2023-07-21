package homeWork.steps;

import homeWork.Page.LoginPageHW;
import homeWork.Page.ProductsPageHW;
import homeWork.base.BaseStepsHW;
import org.openqa.selenium.WebDriver;

public class LoginStepsHW extends BaseStepsHW {


    public LoginStepsHW(WebDriver wd) {
        super(wd);
    }



    public ProductsPageHW successLogin(String name, String password){
        loginPage.login(name,password);
        return productPage;
    }

    public LoginPageHW negativeLogin(String name, String password){
        loginPage.login(name,password);
        return loginPage;
    }


}
