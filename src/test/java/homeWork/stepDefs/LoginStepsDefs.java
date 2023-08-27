package homeWork.stepDefs;

import homeWork.Page.*;
import homeWork.base.BaseCucumber;
import homeWork.steps.*;
import io.cucumber.java.en.*;
import org.testng.Assert;
import utils.configuration.ReadProperties;

public class LoginStepsDefs extends BaseCucumber {
    private BaseCucumber baseCucumber;

    public LoginStepsDefs(BaseCucumber baseCucumber) {
        this.baseCucumber = baseCucumber;
    }

    LoginPage loginPage;
    LoginSteps loginSteps;
    ProductsSteps productsSteps;
    FinishSteps finishSteps;
    CheckoutSteps checkoutSteps;
    BasketSteps basketSteps;


    @Given("start browser")
    public void startBrowser() {

    }

    @Given("open login page")
    public void openLoginPage() {
        driver.get(ReadProperties.getUrl());
    }

    @When("user enter username {} and password {}")
    public void setUsernameAndPassword(String username, String password) {
        loginPage = new LoginPage(driver);
        loginPage.login(username, password);
    }

    @Then("productsPage page is displayed")
    public void isDashboardPageDisplayed() {
        Assert.assertTrue(new ProductsPage(driver).isPageOpen());
    }

    @When("^user choose goods (\\d+)$")
    public void clickGoodsButton(int value) {
        productsSteps = new ProductsSteps(driver);
        productsSteps.clickGoodsButtonAdd(value);
    }

    @When("basketPage page is displayed")
    public void basketPagePageIsOpen(){
        Assert.assertTrue(new BasketPage(driver).isPageOpen());
    }

    @Then("user out of the basket goes to the deal")
    public void userGoesToDeal(){
        basketSteps = new BasketSteps(driver);
        basketSteps.clickCheckout();
    }

    @When("checkoutPage is displayed")
    public void checkoutPagePageIsOpen(){
        Assert.assertTrue(new CheckoutPage(driver).isPageOpen());
    }



    @When("user fills data firstname {} lastname {} zipcode {}")
    public void clickLoginButton(String name, String lastName, String zipCode) {
        checkoutSteps = new CheckoutSteps(driver);
        checkoutSteps.fillData(name,lastName,zipCode );
    }

    @Then("finishPage is displayed")
    public void finishPageIsOpen(){
        Assert.assertTrue(new FinishPage(driver).isPageOpen());
    }

    @When("user click finishButton")
    public void finishSteps(){
        finishSteps = new FinishSteps(driver);
        finishSteps.clickButtonFinishPage();
    }

    @Then("completePage is displayed")
    public void completePageIsOpen(){
        Assert.assertTrue(new CompletePage(driver).isPageOpen());
    }




}
