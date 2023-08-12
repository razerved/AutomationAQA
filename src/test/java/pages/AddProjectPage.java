package pages;

import baseEntities.BasePage;
import models.Project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Date;


public class AddProjectPage extends BasePage {
    private final static String pagePath = "/index.php?/dashboard/";

    // Блок описания локаторов для элементов
    private final By headerTitleLabelLocator = By.xpath("//div[contains(@class, 'content-header-title') and contains(text(), 'All Projects')]");

    // Блок инициализации
    public AddProjectPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return headerTitleLabelLocator;
    }

    public void openPageByUrl() {
        super.openPageByUrl(pagePath);
    }

    // Блок атомарных методов
    public WebElement getHeaderTitle() {
        return driver.findElement(headerTitleLabelLocator);
    }

    private void setProjectName(String projectName) {
    }
    private void setAnnouncement(String announcement) {
    }
    private void setFlag(boolean flag) {

    }
    private void setProjectType(int projectType) {
    }
    private void setDate(Date date) {
    }


    public void fillForm(Project project) {
        /*setProjectName(project.getProjectName());
        setAnnouncement(project.getAnnouncement());
        setFlag(project.isFlag());
        setProjectType(project.getProjectType());
        setDate(project.getDate());*/
    }




}
