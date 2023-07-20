package homeWork.steps;

import homeWork.Page.BascetPageHW;
import homeWork.Page.LoginPageHW;
import homeWork.Page.ProductsPageHW;
import org.openqa.selenium.WebDriver;

public class BaseStepsHW {
    protected WebDriver wd;

    protected LoginPageHW lp;
    protected ProductsPageHW pp;
    protected BascetPageHW bp;
    public BaseStepsHW(WebDriver wd) {
        this.wd = wd;

        lp = new LoginPageHW(wd);
        pp = new ProductsPageHW(wd);
        bp = new BascetPageHW(wd);
    }


    public ProductsPageHW successLogin(String name, String password){
        lp.login(name,password);
        return pp;
    }

    public LoginPageHW negativeLogin(String name, String password){
        lp.login(name,password);
        return lp;
    }



}
