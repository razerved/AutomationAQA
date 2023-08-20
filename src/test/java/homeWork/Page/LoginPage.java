package homeWork.Page;

import com.codeborne.selenide.SelenideElement;
import homeWork.base.BasePage;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends BasePage {
    private final SelenideElement usernameLocator = $("#user-name");
    private final SelenideElement passwordLocator = $("#password");
    private final SelenideElement loginButtonLocator = $("#login-button");



    public LoginPage() {
        super();
    }

    @Override
    protected SelenideElement getPageIdentifier() {
        return usernameLocator;
    }

    public SelenideElement getUsernameLocator() {
        return usernameLocator;
    }

    public SelenideElement getPasswordLocator() {
        return passwordLocator;
    }

    public SelenideElement getLoginButton() {
        return loginButtonLocator;
    }

    public void setUsernameLocator(String value){
        getUsernameLocator().setValue(value);
    }

    public void setPasswordLocator(String value){
        getPasswordLocator().setValue(value);
    }


    public void login(String user, String pass){
        setUsernameLocator(user);
        setPasswordLocator(pass);
        getLoginButton().click();
    }





}
