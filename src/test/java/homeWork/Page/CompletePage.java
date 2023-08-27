package homeWork.Page;

import homeWork.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CompletePage extends BasePage {
    private final String path = "/checkout-complete.html";
    private final By backHomeButtonLocator = By.name("back-to-products");
    public CompletePage(WebDriver wd) {
        super(wd);
    }

    @Override
    protected By getPageIdentifier() {
        return backHomeButtonLocator;
    }


    public WebElement getBackHomeButtonLocator() {
        return wd.findElement(backHomeButtonLocator);
    }

    public void clickBackHomeButton(){
        getBackHomeButtonLocator().click();
    }



}
