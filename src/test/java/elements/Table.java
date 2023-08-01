package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Table {
    private UIElement uiElement;
    private WebDriver driver;
    private List<String> colums;

    /**
     * Данный элемент идентифицируется по тегу <table></table>
     *
     * @param driver
     * @param by
     */
    public Table(WebDriver driver, By by) {
        this.driver = driver;
        this.uiElement = new UIElement(driver, by); // получаем локатор таблицы целеком, определяем как WebElement
        // (обертки UIelement)
        this.colums = new ArrayList<>();

        for (UIElement element : uiElement.findUIElements(By.tagName("th"))) { //так как findElements возврощает WebElement
            //модифицируем в UIElement на findUIElements
            colums.add(element.getText()); // загоняем в текущий List colum
        }

    }

    public Table(WebDriver driver, WebElement webElement) {
        this.driver = driver;
        this.uiElement = new UIElement(driver, webElement);

    }


    public TableCell getCell(int columIndex, int rowIndex) {
        TableRow tableRow = getRow(rowIndex);
        return tableRow.getCell(columIndex);
    }

    public TableCell getCell(String columName, int rowIndex) {
        int columIndex = colums.indexOf(columName);
        return getCell(columIndex, rowIndex);
    }

    /**
     * Данный метод получает все строки включая Header строку. Поэтому индекс будет считаться с учетом этой строки
     * @param index
     * @return
     */

    public TableRow getRow(int index) {
        ArrayList<UIElement> list = (ArrayList<UIElement>) uiElement.findUIElements(By.xpath("//tr/td/.."));
        return new TableRow(driver, list.get(index));
    }

    public TableCell getCell(String targetColumName, String uniqueValue, String expectedColumName){
        int columIndex = colums.indexOf(targetColumName);
        return null;
    }

}
