package homeWork.steps;

import homeWork.Page.LoginPage;
import homeWork.Page.ProductsPage;
import homeWork.base.BaseSteps;

public class LoginSteps extends BaseSteps {


    public LoginSteps() {
        super();
    }



    public ProductsPage successLogin(String name, String password){
        loginPage.login(name,password);
        return productPage;
    }

    public LoginPage negativeLogin(String name, String password){
        loginPage.login(name,password);
        return loginPage;
    }


}
