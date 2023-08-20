package homeWork.base;

import homeWork.Page.*;

public class BaseSteps {
    protected LoginPage loginPage;
    protected ProductsPage productPage;
    protected BasketPage basketPage;
    protected CheckoutPage checkoutPage;
    protected FinishPage finishPage;
    protected CompletePage completePage;
    public BaseSteps() {

        loginPage = new LoginPage();
        productPage = new ProductsPage();
        basketPage = new BasketPage();
        checkoutPage = new CheckoutPage();
        finishPage = new FinishPage();
        completePage = new CompletePage();
    }






}
