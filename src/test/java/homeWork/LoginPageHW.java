package homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageHW extends BasePageHW {
    private final By usernameLocator = By.id("user-name");
    private final By passwordLocator = By.id("password");
    private final By loginButtonLocator = By.id("login-button");



    public LoginPageHW(WebDriver wd) {
        super(wd);
    }

    @Override
    protected By getPageIdentifier() {
        return usernameLocator;
    }

    public WebElement getUsernameLocator() {
        return wd.findElement(usernameLocator);
    }

    public WebElement getPasswordLocator() {
        return wd.findElement(passwordLocator);
    }

    public WebElement getLoginButton() {
        return wd.findElement(loginButtonLocator);
    }

    public void setUsernameLocator(String value){
        getUsernameLocator().sendKeys(value);
    }

    public void setPasswordLocator(String value){
        getPasswordLocator().sendKeys(value);
    }


    public void login(String user, String pass){
        setUsernameLocator(user);
        setPasswordLocator(pass);
        getLoginButton().click();
    }





}
