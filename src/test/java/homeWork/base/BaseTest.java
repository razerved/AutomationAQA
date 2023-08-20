package homeWork.base;

import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import homeWork.steps.*;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.configuration.ReadProperties;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    protected LoginSteps loginStep;
    protected ProductsSteps productsSteps;
    protected BasketSteps basketStep;
    protected CheckoutSteps checkoutStep;
    protected FinishSteps finishSteps;
    protected CompleteSteps completeSteps;
    //protected FinishPageHW finishPage;

    @BeforeMethod
    public void setUp(){
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        Configuration.baseUrl = ReadProperties.getUrl();
        Configuration.timeout = 6000;
        Configuration.browserSize = "1920x1080";
        Configuration.browser = Browsers.FIREFOX;


        loginStep = new LoginSteps();
        basketStep = new BasketSteps();
        checkoutStep = new CheckoutSteps();
        productsSteps = new ProductsSteps();
        finishSteps = new FinishSteps();
        completeSteps = new CompleteSteps();

        open("");

    }

    @AfterMethod
    public void tearDown(){
       closeWebDriver();
    }





}
