package homeWork;

import factory.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.configuration.ReadProperties;

public class BaseTestHW {
    protected WebDriver wd;

    protected LoginPageHW lp;
    protected BaseStepsHW bs;
    protected BascetPageHW bp;

    @BeforeMethod
    public void setUp(){
        BrowserFactory browserFactory = new BrowserFactory();
        wd = browserFactory.getDriver();
        lp = new LoginPageHW(wd);
        bs = new BaseStepsHW(wd);
        bp = new BascetPageHW(wd);

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
