package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TableCell {
    private UIElement uiElement;
    private WebDriver driver;




    public TableCell(WebDriver driver, UIElement uiElement) {

        this.uiElement = uiElement;
    }

    public TableCell(WebDriver driver, By by) {

        this.uiElement = new UIElement(driver, by);
    }


    public UIElement getAsUIElement(){
        return uiElement;
    }
    public UIElement getLink(){
        return uiElement.findElement(By.tagName("a"));
    }


}
