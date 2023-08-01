package tests;

import baseEntities.BaseTest;
import elements.TableCell;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.ProjectsPage;
import utils.configuration.ReadProperties;

public class WrappersTest extends BaseTest {
    @Test
    public void test1(){
        driver.get("http://the-internet.herokuapp.com/checkboxes");

        WebElement checBox = driver.findElement(By.cssSelector("#checkboxes input"));

    }
    private void setCheckBox(WebElement element){
        if (!element.isSelected()){
            element.click();
        }
    }
    private void removeCheckBox(WebElement element){
        if (!element.isSelected()){
            element.click();
        }
    }

    @Test
    public void test2(){
        loginStep.successLogin(ReadProperties.username(), ReadProperties.password());
        ProjectsPage projectsPage = new ProjectsPage(driver);
        projectsPage.openPageByUrl();

        TableCell cell = projectsPage.getProjectsTable().getCell(1 ,0);
        cell.getAsUIElement().click();
        //cell.getAsUIElement().findElement(By.tagName("a")).click();
        //cell.getLink().click();
    }




}
