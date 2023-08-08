package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDown {
    private UIElement uiElement;
    private WebDriver driver;


    public DropDown(WebDriver driver, UIElement uiElement) {
        this.uiElement = uiElement;
        this.driver = driver;
    }

    public DropDown(WebDriver driver, By by) {
        this.uiElement = new UIElement(driver, by);
        this.driver = driver;
    }




}
