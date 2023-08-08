package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBox {
    private UIElement uiElement;
    private WebDriver driver;


    public CheckBox(WebDriver driver, UIElement uiElement) {
        this.uiElement = uiElement;
        this.driver = driver;
    }

    public CheckBox(WebDriver driver, By by) {
        this.uiElement = new UIElement(driver, by);
        this.driver = driver;
    }


    public void find(){
       uiElement.click();
    }


    public void selectClickCheckBox() {
        if (!uiElement.isSelected()) {
            uiElement.click();
        }
    }
    public void removeClickCheckBox() {
        if (uiElement.isSelected()) {
            uiElement.click();
        }
    }


    public UIElement getAsUIElement(){
        return uiElement;
    }



}
