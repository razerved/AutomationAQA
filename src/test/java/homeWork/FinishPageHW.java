package homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class FinishPageHW extends BasePageHW {

    private final String path = "/checkout-step-two.html";

    private final By finishButtonLocator = By.id("finish");

    public FinishPageHW(WebDriver wd) {
        super(wd);
    }

    @Override
    protected By getPageIdentifier() {
        return finishButtonLocator;
    }


    public WebElement getFinishButtonLocator() {
        return wd.findElement(finishButtonLocator);
    }

    public CompletePageHW clickButtonFinishPage(){
        getFinishButtonLocator().click();
        return new CompletePageHW(wd);
    }


}
