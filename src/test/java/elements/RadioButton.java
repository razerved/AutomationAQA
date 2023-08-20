package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
public class RadioButton {
    private List<UIElement> optionsList = new ArrayList<>();
    private List<String> textsList = new ArrayList<>();
    private List<String> valuesList = new ArrayList<>();

    public RadioButton(WebDriver driver, By by) {
        for (WebElement webElement : driver.findElements(by)) {
            UIElement element = new UIElement(driver, webElement);
            optionsList.add(element);
            textsList.add(element.findUIElement(By.xpath("parent::*/strong")).getText());
            valuesList.add(element.getAttribute("value"));
        }
    }

    public void selectByIndex(int index) {
        optionsList.get(index).click();
    }

    public void selectByText(String text) {
        optionsList.get(textsList.indexOf(text)).click();
    }

    public void selectByValue(String value) {
        optionsList.get(valuesList.indexOf(value)).click();
    }

    public List<String> getOptionsTextList() {
        return textsList;
    }
}
