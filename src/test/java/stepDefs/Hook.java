package stepDefs;

import baseEntities.BaseCucumber;
import factory.BrowserFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Step;

public class Hook extends BaseCucumber {
    private BaseCucumber baseCucumber;
    public Hook(BaseCucumber baseCucumber) {
        this.baseCucumber = baseCucumber;
    }

    @Before(value = "@api")
    @Step("initApiConnection")
    public void initApi(Scenario scenario){
        System.out.println("Init connection to the server");
    }

    @Before(value = "@gui", order = 10001) //10000-default выполняется первый, 10001 выполняется 2-ым
    //если перед сценарием стоит (value=@gui and @smoke), то выполняем before
    @Step("initBrowserConnection")
    public void init(Scenario scenario){
        baseCucumber.driver = new BrowserFactory().getDriver();
    }

    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            System.out.println("screenShot");
        }
        baseCucumber.driver.quit();
    }

}
