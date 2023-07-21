package homeWork.base;

import factory.BrowserFactory;
import homeWork.steps.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.configuration.ReadProperties;

public class BaseTestHW {
    protected WebDriver wd;

    protected LoginStepsHW loginStep;
    protected ProductsStepsHW productsSteps;
    protected BasketStepsHW basketStep;
    protected CheckoutStepsHW checkoutStep;
    protected FinishStepsHW finishSteps;
    protected CompleteStepsHW completeSteps;
    //protected FinishPageHW finishPage;

    @BeforeMethod
    public void setUp(){
        BrowserFactory browserFactory = new BrowserFactory();
        wd = browserFactory.getDriver();

        loginStep = new LoginStepsHW(wd);
        basketStep = new BasketStepsHW(wd);
        checkoutStep = new CheckoutStepsHW(wd);
        productsSteps = new ProductsStepsHW(wd);
        finishSteps = new FinishStepsHW(wd);
        completeSteps = new CompleteStepsHW(wd);

        wd.get(ReadProperties.getUrl());
    }

    @AfterMethod
    public void tearDown(){
        wd.quit();
    }





}
