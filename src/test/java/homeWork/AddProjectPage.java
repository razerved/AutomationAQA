package homeWork;

import baseEntities.BasePage;
import elements.RadioButton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddProjectPage extends BasePage {
    private final static String pagePath = "/index.php?/admin/projects/add";

    private final By tableBox = By.cssSelector("div.table input.radio");
    private final By radioButton = By.cssSelector("div.table div.row.add-project-row input");
    private final By textRadioButton = By.xpath("//div[@class='row add-project-row']//label");

    private final By allCheckBox = By.xpath("//div[@class='row add-project-row']//label/input");

    private final By tableProject = By.xpath("//div[@class='row add-project-row']/..");

    public AddProjectPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return null;
    }

    public void openPageByUrl(){
        super.openPageByUrl(pagePath);
    }

    public RadioButton getTableProject(){
        return new RadioButton(driver, tableProject);
    }




}
