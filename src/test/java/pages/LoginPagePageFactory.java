package pages;


import baseEntities.BasePagePageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPagePageFactory extends BasePagePageFactory {

    //Блок описания локаторов для элементов
    @FindBy(id = "name")
    public WebElement emailName;
    @FindBy(id = "password")
    public WebElement pswInput;
    @FindBy(id = "button_primary")
    public WebElement logIbButton;
    @FindBy(className = "error-text")
    public WebElement errorText;
    @FindBy(className = "loginpage-message")
    public WebElement errorFieldText;


    public LoginPagePageFactory(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return null;
    }


    public void loginPageFactory(String username, String password) {
        emailName.sendKeys(username);
        pswInput.sendKeys(password);
        logIbButton.click();
    }


}
