package tests;

import baseEntities.BaseTest;
import elements.CheckBox;
import elements.RadioButton;
import elements.TableCell;
import homeWork.AddProjectPage;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProjectsPage;
import utils.configuration.ReadProperties;

public class WrappersTest extends BaseTest {
    @Test
    public void test1() {
        driver.get("http://the-internet.herokuapp.com/checkboxes");

        WebElement checBox = driver.findElement(By.cssSelector("#checkboxes input"));

    }

    private void setCheckBox(WebElement element) {
        if (!element.isSelected()) {
            element.click();
        }
    }

    private void removeCheckBox(WebElement element) {
        if (!element.isSelected()) {
            element.click();
        }
    }

    @Test
    public void test2() {
        loginStep.successLogin(ReadProperties.username(), ReadProperties.password());
        ProjectsPage projectsPage = new ProjectsPage(driver);
        projectsPage.openPageByUrl();

        TableCell cell = projectsPage.getProjectsTable().getCell(1, 0);
        cell.getAsUIElement().click();
        //cell.getAsUIElement().findElement(By.tagName("a")).click();
        //cell.getLink().click();
    }

    @Test(description = "Домашняя работа")
    @Description("Тест selectByIndex,selectByValue,selectByText")
    public void test4() {
        loginStep.successLogin(ReadProperties.username(), ReadProperties.password());
        AddProjectPage addProjectPage = new AddProjectPage(driver);
        addProjectPage.openPageByUrl();

        addProjectPage.getType().selectByIndex(1);
        addProjectPage.getType().selectByValue("2");
        addProjectPage.getType().selectByText("Use multiple test suites to manage cases");
    }
    @Test(description = "Домашняя работа")
    @Description("Тест clickCheckBox and removeCheckBox")
    public void test5() throws InterruptedException {
        loginStep.successLogin(ReadProperties.username(), ReadProperties.password());
        AddProjectPage addProjectPage = new AddProjectPage(driver);
        addProjectPage.openPageByUrl();

        addProjectPage.getCheckBoxLocator().selectClickCheckBox();
        Thread.sleep(1400);
        addProjectPage.getCheckBoxLocator().removeClickCheckBox();

    }

    @Test(description = "Домашняя работа")
    @Description("Тест DropDown")
    public void test6() throws InterruptedException {
        loginStep.successLogin(ReadProperties.username(), ReadProperties.password());
        AddProjectPage addProjectPage = new AddProjectPage(driver);
        addProjectPage.openPageByUrl2();


        Thread.sleep(1400);


    }






}
