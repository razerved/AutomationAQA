package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;


public class RadioButton {


    private List<UIElement> uiElementsList;
    private List<String> valueList;
    private List<String> textList;

    public RadioButton(WebDriver driver, By by) {

        this.uiElementsList = new ArrayList<>();
        this.valueList = new ArrayList<>();
        this.textList = new ArrayList<>();

        for (WebElement webElement : driver.findElements((by))) {
            UIElement element = new UIElement(driver, webElement);
            textList.add(element.findUIElement(By.xpath("parent::*/strong")).getText().trim());
            valueList.add(element.getAttribute("value"));
            uiElementsList.add(element);
        }

    }

    public void selectByIndex(int index) {
        uiElementsList.get(index).click();
    }

    public void selectByValue(String value) {
        uiElementsList.get(valueList.indexOf(value)).click();
    }

    public void selectByText(String text) {
        uiElementsList.get(textList.indexOf(text)).click();
    }



}
