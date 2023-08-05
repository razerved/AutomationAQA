package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class RadioButton {

    private UIElement uiElement;
    private List<String> tableAll;

    public RadioButton(WebDriver driver, By by) {

        this.uiElement = new UIElement(driver, by);
        this.tableAll = new ArrayList<>();

        /*for (UIElement element : uiElement.findUIElements(By.xpath("//div[@class='row add-project-row']//label/strong")))
            textBox.add(element.getText());*/
        for (UIElement element : uiElement.findUIElements(By.xpath("//div[@class='radio']//label/strong"))) //div[@class='row add-project-row'] //div[@class='radio']//label/strong
            tableAll.add(element.getText());

    }

    public List<String> getAllNameProject() {
        List<String> findText = new ArrayList<>();
        for (UIElement elem : uiElement.findUIElements
                (By.xpath("//label/strong")))
            findText.add(elem.getText());
        return findText;
    }

    public void getRadioButtonByNameProjectClick(String name) {
        int numberName = getAllNameProject().indexOf(name);
        ArrayList<UIElement> listBox = (ArrayList<UIElement>) uiElement.findUIElements(By.xpath("//label/input"));
        UIElement box = listBox.get(numberName);
        box.click();
    }

    public void getRadioButtonByIndexClick(int index) {
        List<UIElement> listValue = uiElement.findUIElements(By.cssSelector("input.radio"));
        listValue.add(0, null);
        listValue.get(index).click();
    }


    public void test(int value) {
        String newValue = Integer.toString(value);
        int x = getValue().indexOf(newValue);
        ArrayList<UIElement> listBox = (ArrayList<UIElement>) uiElement.findUIElements(By.cssSelector("input.radio"));
        UIElement box = listBox.get(x);
        box.click();
    }

    public List<String> getValue() {
        List<String> listValue = new ArrayList<>();
        for (UIElement element : uiElement.findUIElements(By.cssSelector("input.radio")))
            listValue.add(element.getAttribute("value"));
        return listValue;
    }


    public void isSelectedClick() {
        if (!uiElement.isSelected()) {
            uiElement.click();
        }
    }

    public void clickRadioButton() {
        uiElement.click();
    }

    public void sorted() {

    }


}
