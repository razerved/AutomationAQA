package homeWork.base;

import factory.BrowserFactory;
import homeWork.steps.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.configuration.ReadProperties;

public class BaseTest {
    protected WebDriver wd;

    protected LoginSteps loginStep;
    protected ProductsSteps productsSteps;
    protected BasketSteps basketStep;
    protected CheckoutSteps checkoutStep;
    protected FinishSteps finishSteps;
    protected CompleteSteps completeSteps;
    //protected FinishPageHW finishPage;

    @BeforeMethod
    public void setUp(){
        BrowserFactory browserFactory = new BrowserFactory();
        wd = browserFactory.getDriver();

        loginStep = new LoginSteps(wd);
        basketStep = new BasketSteps(wd);
        checkoutStep = new CheckoutSteps(wd);
        productsSteps = new ProductsSteps(wd);
        finishSteps = new FinishSteps(wd);
        completeSteps = new CompleteSteps(wd);

        wd.get(ReadProperties.getUrl());
    }

    @AfterMethod
    public void tearDown(){
        wd.quit();
    }





}
