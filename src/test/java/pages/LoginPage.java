package pages;

import baseEntities.BasePage;
import com.codeborne.selenide.SelenideElement;
import models.User;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends BasePage {

    //Блок описания локаторов для элементов
    private final By emailNameLocator = By.id("name");
    private final By pswInputLocator = By.id("password");
    private final By logIbButtonLocator = By.id("button_primary");
    private final By errorTextLocator = By.className("error-text");
    private final By errorFieldTextLocator = By.className("loginpage-message");


    //Блок инициализации

    public LoginPage() {
        super();
    }


    @Override
    protected By getPageIdentifier() {
        return logIbButtonLocator;
    }

    // Блок атомарных методов
    public SelenideElement getEmailInput() {
        return $(emailNameLocator);
    }

    public SelenideElement getPswInput() {
        return $(pswInputLocator);
    }

    public boolean isPswInputDisplayed() {
        return $(getPswInput()).isDisplayed();
    }

    public SelenideElement getLogInButton() {
        return $(logIbButtonLocator);
    }

    public void setEmail(String value) {
        getEmailInput().setValue(value);
    }

    public SelenideElement getErrorTextElement() {
        return $(errorTextLocator);
    }

    public SelenideElement getErrorFieldTextElement() {
        return $(errorFieldTextLocator);
    }

    // Блок комплексных методов
    public void login(User user) {
        setEmail(user.getEmail());
        getPswInput().sendKeys(user.getPassword());
        getLogInButton().click();
    }
    public void login(String user, String password) {
        setEmail(user);
        getPswInput().sendKeys(password);
        getLogInButton().click();
    }


}
