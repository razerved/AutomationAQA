package homeWork;

import baseEntities.BasePage;
import elements.CheckBox;
import elements.RadioButton;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddProjectPage extends BasePage {
    private final static String pagePath = "/index.php?/admin/projects/add";
    private final static String pagePath2 = "/index.php?/cases/add/1";

    private final By tableBox = By.cssSelector("div.table input.radio");
    private final By radioButton = By.cssSelector("div.table div.row.add-project-row input");
    private final By textRadioButton = By.xpath("//div[@class='row add-project-row']//label");


    private final By checkBoxLocator = By.id("show_announcement");

    private final By addProjectButtonLocator = By.id("accept");


    public AddProjectPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return null;
    }

    public void openPageByUrl() {
        super.openPageByUrl(pagePath);
    }
    public void openPageByUrl2() {
        super.openPageByUrl(pagePath);
    }


    public RadioButton getType(){
        return new RadioButton(driver, By.name("suite_mode"));
    }
    public CheckBox getCheckBoxLocator() {
        return new CheckBox(driver, checkBoxLocator);
    }

}
