package homeWork.base;

import factory.BrowserFactory;
import homeWork.Page.CheckoutPageHW;
import homeWork.Page.FinishPageHW;
import homeWork.Page.LoginPageHW;
import homeWork.steps.BasketStepsHW;
import homeWork.steps.CheckoutStepsHW;
import homeWork.steps.LoginStepsHW;
import homeWork.steps.ProductsStepsHW;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.configuration.ReadProperties;

public class BaseTestHW {
    protected WebDriver wd;

    protected LoginStepsHW loginStep;
    protected ProductsStepsHW productsStepsHW;
    protected BasketStepsHW basketStep;
    protected CheckoutStepsHW checkoutStep;
    //protected FinishPageHW finishPage;

    @BeforeMethod
    public void setUp(){
        BrowserFactory browserFactory = new BrowserFactory();
        wd = browserFactory.getDriver();

        loginStep = new LoginStepsHW(wd);
        basketStep = new BasketStepsHW(wd);
        checkoutStep = new CheckoutStepsHW(wd);
        productsStepsHW = new ProductsStepsHW(wd);


        wd.get(ReadProperties.getUrl());
    }

    @AfterMethod
    public void tearDown(){
        wd.quit();
    }





}
