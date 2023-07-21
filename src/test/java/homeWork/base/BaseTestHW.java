package homeWork.base;

import factory.BrowserFactory;
import homeWork.Page.CheckoutPageHW;
import homeWork.Page.BasketPageHW;
import homeWork.Page.FinishPageHW;
import homeWork.Page.LoginPageHW;
import homeWork.steps.BaseStepsHW;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.configuration.ReadProperties;

public class BaseTestHW {
    protected WebDriver wd;

    protected LoginPageHW loginPage;
    protected BaseStepsHW baseStep;
    protected BasketPageHW basketPage;
    protected CheckoutPageHW checkoutPage;
    protected FinishPageHW finishPage;

    @BeforeMethod
    public void setUp(){
        BrowserFactory browserFactory = new BrowserFactory();
        wd = browserFactory.getDriver();
        loginPage = new LoginPageHW(wd);
        baseStep = new BaseStepsHW(wd);
        basketPage = new BasketPageHW(wd);

        checkoutPage = new CheckoutPageHW(wd);
        finishPage = new FinishPageHW(wd);

        wd.get(ReadProperties.getUrl());
    }

    @AfterMethod
    public void tearDown(){
        wd.quit();
    }



    public LoginPageHW getLoginPage() {
        return loginPage;
    }
    public BaseStepsHW getBaseStep(){
        return baseStep;
    }


}
