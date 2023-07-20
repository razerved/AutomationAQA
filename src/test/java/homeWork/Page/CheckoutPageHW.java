package homeWork.Page;

import homeWork.Page.BasePageHW;
import homeWork.Page.FinishPageHW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPageHW extends BasePageHW {
    private final String  path = "/checkout-step-one.html";


    private final By nameLocator = By.id("first-name");
    private final By lastNameLocator = By.id("last-name");
    private final By zipLocator = By.id("postal-code");

    private final By continueButtonLocator = By.id("continue");


    public CheckoutPageHW(WebDriver wd) {
        super(wd);
    }

    @Override
    protected By getPageIdentifier() {
        return continueButtonLocator;
    }


    public WebElement getNameLocator() {
        return wd.findElement(nameLocator);
    }
    public WebElement getLastNameLocator() {
        return wd.findElement(lastNameLocator);
    }
    public WebElement getZipLocator() {
        return wd.findElement(zipLocator);
    }

    public WebElement getContinueButtonLocator() {
        return wd.findElement(continueButtonLocator);
    }

    public void setName(String name){
        getNameLocator().sendKeys(name);
    }
    public void setLastName(String lastName){
        getLastNameLocator().sendKeys(lastName);
    }
    public void setZip(String zipCode){
        getZipLocator().sendKeys(zipCode);
    }

    public FinishPageHW fillData(String name, String lastName, String zipCode){
        getNameLocator().sendKeys(name);
        getLastNameLocator().sendKeys(lastName);
        getZipLocator().sendKeys(zipCode);
        getContinueButtonLocator().click();
        return new FinishPageHW(wd);
    }



}
