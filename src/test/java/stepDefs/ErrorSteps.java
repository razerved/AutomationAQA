package stepDefs;

import baseEntities.BaseCucumber;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.LoginPage;


public class ErrorSteps extends BaseCucumber {
    private BaseCucumber baseCucumber;

    public ErrorSteps(BaseCucumber baseCucumber) {
        this.baseCucumber = baseCucumber;
    }


    @Then("error {} id displayed")
    public void isErrorDisplayed(String error){
        Assert.assertTrue(new LoginPage(driver)
                .getErrorTextLocator().getText().equals(error));

    }






}
