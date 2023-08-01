package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import services.WaitService;

public class Input {
    private UIElement uiElement;
    private WaitService waitService;

    public Input(WebDriver driver, By by) {
        this.uiElement = new UIElement(driver, by);
        this.waitService = new WaitService(driver);
    }

    public Input(WebDriver driver, WebElement webElement) {
        this.uiElement = new UIElement(driver, webElement);
        this.waitService = new WaitService(driver);
    }

    public void sendKey(CharSequence... keyToSend) {
        uiElement.sendKeys(keyToSend);
    }
    public void clearAndSendKey(CharSequence... keyToSend) {
        uiElement.clear();
        uiElement.sendKeys(keyToSend);
    }

}
