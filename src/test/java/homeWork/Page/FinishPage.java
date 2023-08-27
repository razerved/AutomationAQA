package homeWork.Page;

import homeWork.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FinishPage extends BasePage {

    private final String path = "/checkout-step-two.html";

    private final By finishButtonLocator = By.id("finish");

    public FinishPage(WebDriver wd) {
        super(wd);
    }

    @Override
    protected By getPageIdentifier() {
        return finishButtonLocator;
    }


    public WebElement getFinishButtonLocator() {
        return wd.findElement(finishButtonLocator);
    }




}
