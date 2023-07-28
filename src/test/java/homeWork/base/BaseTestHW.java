package homeWork.base;

import baseEntities.InvokedListener;
import factory.BrowserFactory;
import homeWork.steps.*;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import utils.configuration.ReadProperties;

@Listeners(InvokedListenerHW.class)
public class BaseTestHW {
    protected WebDriver wd;

    protected LoginStepsHW loginStep;
    protected ProductsStepsHW productsSteps;
    protected BasketStepsHW basketStep;
    protected CheckoutStepsHW checkoutStep;
    protected FinishStepsHW finishSteps;
    protected CompleteStepsHW completeSteps;
    //protected FinishPageHW finishPage;

    public static void setDriverToContext(ITestContext iTestContext, WebDriver wd){
        iTestContext.setAttribute("WebDriver", wd);
    }
    @BeforeMethod
    public void setUp(ITestContext iTestContext){
        BrowserFactory browserFactory = new BrowserFactory();
        wd = browserFactory.getDriver();
        this.setDriverToContext(iTestContext, wd);

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
