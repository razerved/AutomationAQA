package pages;

import baseEntities.BasePage;
import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageValueObject extends BasePage {

    //Блок описания локаторов для элементов
    private final By emailNameLocator = By.id("name");
    private final By pswInputLocator = By.id("password");
    private final By logIbButtonLocator = By.id("button_primary");
    private final By errorTextLocator = By.className("error-text");
    private final By errorFieldTextLocator = By.className("loginpage-message");


    //Блок инициализации

    public LoginPageValueObject(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return logIbButtonLocator;
    }

    //Блок атомарных методов

    public WebElement getEmailInput() {
        return driver.findElement(emailNameLocator);
    }

    public WebElement getPswInput() {
        return driver.findElement(pswInputLocator);
    }

    public WebElement getLogIbButton() {
        return driver.findElement(logIbButtonLocator);
    }

    public WebElement getErrorTextLocator() {
        return driver.findElement(errorTextLocator);
    }

    public WebElement getErrorFieldTextLocator() {
        return driver.findElement(errorFieldTextLocator);
    }


    public void setEmail(String value) {
        getEmailInput().sendKeys(value);
    }

    //Блок комплексных методов



    public void loginValueObject(User user) {
        setEmail(user.getEmail());
        getPswInput().sendKeys(user.getPassword());
        getLogIbButton().click();
    }






}
