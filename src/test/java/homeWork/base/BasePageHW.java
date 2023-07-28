package homeWork.base;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class BasePageHW {
    protected WebDriver wd;

    public BasePageHW(WebDriver wd) {
        this.wd = wd;
    }

    protected abstract By getPageIdentifier();
    @Step
    public boolean isPageOpen(){
        return wd.findElement(getPageIdentifier()).isDisplayed();
    }
}
