package homeWork.base;

import homeWork.Page.*;
import org.openqa.selenium.WebDriver;

public class BaseStepsHW {
    protected WebDriver wd;

    protected LoginPageHW loginPage;
    protected ProductsPageHW productPage;
    protected BasketPageHW basketPage;
    protected CheckoutPageHW checkoutPage;
    protected FinishPageHW finishPage;
    public BaseStepsHW(WebDriver wd) {
        this.wd = wd;

        loginPage = new LoginPageHW(wd);
        productPage = new ProductsPageHW(wd);
        basketPage = new BasketPageHW(wd);
        checkoutPage = new CheckoutPageHW(wd);
        finishPage = new FinishPageHW(wd);
    }






}
