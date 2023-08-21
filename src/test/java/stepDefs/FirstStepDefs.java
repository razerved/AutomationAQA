package stepDefs;

import factory.BrowserFactory;
import io.cucumber.java.en.*;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.LoginPage;
import utils.configuration.ReadProperties;

import java.util.Map;

public class FirstStepDefs {
    private WebDriver driver;

    @Given("отрыт браузер")
    public void startBrowser() {
        driver = new BrowserFactory().getDriver();
    }

    @When("страница логина открыта")
    public void openLoginPage() {
        driver.get(ReadProperties.getUrl());
    }

    @Then("поле username отображается")
    public void isUsernameFieldDisplayed() {
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue(true);
        Assert.assertTrue(loginPage.getEmailInput().isDisplayed());
    }

    @And("поле password отображается")
    public void isPasswordFieldDisplayed() {
        Assert.assertTrue(true);
    }

    @But("поле password не отображается")
    public void isPasswordFieldNotDisplayed() {
    }

    @When("user {string} whit password {string} logged in")
    public void userWhitPasswordLoggedIn(String username, String password) {
        System.out.println("username" + username);
        System.out.println("password" + password);
    }


    @Then("title is {string}")
    public void titleIsAllProjects(String value) {
    }


    @And("project id is {int}") // ^project id is (\\d+))$ в виде регулярки
    public void projectIdIs(int arg0) {
    }


    @When("^admin ([^\"]*) whit password \"([^\"]*)\" logged in$")
    public void adminWhitPasswordLoggedIn(String admin, String password) {
        System.out.println("username" + admin);
        System.out.println("password" + password);
    }


    @And("^all elements \"(are|are not)\" visible$")
    public void allElementsAreVisible(String parameter) {
        if (parameter.equals("are")){

        }else {

        }

    }

    @When("users logged in")
    public void usersLoggedIn(DataTable parameters) {
        Map<String, String> expectedValues = parameters.asMap(String.class, String.class);
        System.out.println("username" + expectedValues.get("username"));
        System.out.println("password" + expectedValues.get("password"));
    }


    @Then("error id displayed")
    public void isErrorIsDisplayed() {
        System.out.println("Отобразить ошибку");
    }





}
