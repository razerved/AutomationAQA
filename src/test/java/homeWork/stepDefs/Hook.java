package homeWork.stepDefs;

import homeWork.base.BaseCucumber;
import homeWork.base.BaseTest;


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

    @Before(value = "@gui", order = 10001)
    @Step("Browser initialization")
    public void initGuiScenario(Scenario scenario) {
        driver = new BrowserFactory().getDriver();
    }

    @Before(value = "@gui and @api")
    @Step("Api initialization")
    public void initApiScenario(Scenario scenario) {
        System.out.println("Init connection to the server");
    }


    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            System.out.println("Attach screenshot");
        }
        driver.quit();
    }


}
