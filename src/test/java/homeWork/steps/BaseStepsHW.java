package homeWork.steps;

import homeWork.Page.BasketPageHW;
import homeWork.Page.LoginPageHW;
import homeWork.Page.ProductsPageHW;
import org.openqa.selenium.WebDriver;

public class BaseStepsHW {
    protected WebDriver wd;

    protected LoginPageHW loginPage;
    protected ProductsPageHW productPage;
    protected BasketPageHW basketPage;
    public BaseStepsHW(WebDriver wd) {
        this.wd = wd;

        loginPage = new LoginPageHW(wd);
        productPage = new ProductsPageHW(wd);
        basketPage = new BasketPageHW(wd);
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
