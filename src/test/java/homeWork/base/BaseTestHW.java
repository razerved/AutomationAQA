package homeWork.base;

import factory.BrowserFactory;
import homeWork.Page.CheckoutPageHW;
import homeWork.Page.BascetPageHW;
import homeWork.Page.FinishPageHW;
import homeWork.Page.LoginPageHW;
import homeWork.steps.BaseStepsHW;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.configuration.ReadProperties;

public class BaseTestHW {
    protected WebDriver wd;

    protected LoginPageHW lp;
    protected BaseStepsHW bs;
    protected BascetPageHW bp;

    protected CheckoutPageHW co;
    protected FinishPageHW fp;

    @BeforeMethod
    public void setUp(){
        BrowserFactory browserFactory = new BrowserFactory();
        wd = browserFactory.getDriver();
        lp = new LoginPageHW(wd);
        bs = new BaseStepsHW(wd);
        bp = new BascetPageHW(wd);

        co = new CheckoutPageHW(wd);
        fp = new FinishPageHW(wd);

        wd.get(ReadProperties.getUrl());
    }

    @AfterMethod
    public void tearDown(){
        wd.quit();
    }



    public LoginPageHW getLp() {
        return lp;
    }
    public BaseStepsHW getBs(){
        return bs;
    }


}
