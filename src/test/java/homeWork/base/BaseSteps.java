package homeWork.base;

import homeWork.Page.*;
import org.openqa.selenium.WebDriver;

public class BaseSteps {
    protected WebDriver wd;

    protected LoginPage loginPage;
    protected ProductsPage productPage;
    protected BasketPage basketPage;
    protected CheckoutPage checkoutPage;
    protected FinishPage finishPage;
    protected CompletePage completePage;
    public BaseSteps(WebDriver wd) {
        this.wd = wd;

        loginPage = new LoginPage(wd);
        productPage = new ProductsPage(wd);
        basketPage = new BasketPage(wd);
        checkoutPage = new CheckoutPage(wd);
        finishPage = new FinishPage(wd);
        completePage = new CompletePage(wd);
    }






}
