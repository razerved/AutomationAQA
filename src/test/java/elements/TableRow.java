package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import java.util.ArrayList;


public class TableRow {
    private UIElement uiElement;
    private WebDriver driver;

    /**
     * Данный элемент идентифицируется по тегу <table></table>
     *
     * @param driver
     * @param by
     */
    public TableRow(WebDriver driver, By by) {
        this.driver = driver;
        this.uiElement = new UIElement(driver, by);
    }

    public TableRow(WebDriver driver, UIElement uiElement) {

        this.uiElement = uiElement;

    }

    public TableCell getCell(int index) {
        ArrayList<UIElement> list = (ArrayList<UIElement>) uiElement.findUIElements(By.xpath("td"));
        return new TableCell(driver, list.get(index));
    }


}
