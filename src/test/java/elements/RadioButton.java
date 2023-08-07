package elements;

import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

        /*uiElement.findUIElements(By.xpath("//div[@class='radio']//label/strong")).forEach(element ->
                tableAll.add(element.getText()));*/

    }

    public void getRadioButtonByNameProjectClick(String name) {
        ArrayList<UIElement> listRadioButtons = (ArrayList<UIElement>) uiElement.findUIElements(By.xpath("//label/strong"));
        ArrayList<String> listNames = (ArrayList<String>) listRadioButtons.stream().map(UIElement::getText).collect(Collectors.toList());
        int indexName = listNames.indexOf(name);
        UIElement box = listRadioButtons.get(indexName);
        box.click();
    }

    public void getRadioButtonByIndexClick(int index) {
        List<UIElement> listValue = uiElement.findUIElements(By.cssSelector("input.radio"));
        listValue.get(index - 1).click();
    }


    public void test(String value) {
        //String newValue = Integer.toString(value);
        ArrayList<UIElement> listRadioButtons = (ArrayList<UIElement>) uiElement.findUIElements(By.cssSelector("input.radio"));
        ArrayList<String> listValues = (ArrayList<String>) listRadioButtons.stream()
                .map(x -> x.getAttribute("value")).collect(Collectors.toList());
        int y = listValues.indexOf(value);
        UIElement box = listRadioButtons.get(y);
        box.click();
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
