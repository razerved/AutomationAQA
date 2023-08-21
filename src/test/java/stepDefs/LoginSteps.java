package stepDefs;

import baseEntities.BaseCucumber;
import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.DashboardPage;
import pages.LoginPage;
import utils.configuration.ReadProperties;

public class LoginSteps extends BaseCucumber {

    private BaseCucumber baseCucumber;

    public LoginSteps(BaseCucumber baseCucumber) {
        this.baseCucumber = baseCucumber;
    }

    private LoginPage loginPage;

    @Given("start browser")
    public void startBrowser(){

    }

    @Given("open login page")
    public void  openLoginPage(){
        driver.get(ReadProperties.getUrl());

    }

    @When("user enter username {} and password {}")
    public void setUserNameAndPassword(String username, String password) {
        loginPage = new LoginPage(driver);
        loginPage.getEmailInput().sendKeys(username);
        loginPage.getPswInput().sendKeys(password);
    }

    @When("user click login button")
    public void clickLoginButton() {
        loginPage = new LoginPage(driver);
        loginPage.getLogIbButton().click();
    }


    @Then("dashboard page is displayed")
    public void dashboardDisplayed() {
        Assert.assertTrue(new DashboardPage(driver).isPageOpened());
    }






}
