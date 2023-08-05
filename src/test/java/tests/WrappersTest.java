package tests;

import baseEntities.BaseTest;
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
    @Description("Тест RadioButtonByText")
    public void test3() throws InterruptedException {
        loginStep.successLogin(ReadProperties.username(), ReadProperties.password());
        AddProjectPage addProjectPage = new AddProjectPage(driver);
        addProjectPage.openPageByUrl();

        RadioButton radioButton = addProjectPage.getTableProject();
        radioButton.getRadioButtonByNameProjectClick("Use multiple test suites to manage cases");
        Thread.sleep(1300);
    }

    @Test(description = "Домашняя работа")
    @Description("Тест RadioButtonByIndex")
    public void test4() throws InterruptedException {
        loginStep.successLogin(ReadProperties.username(), ReadProperties.password());
        AddProjectPage addProjectPage = new AddProjectPage(driver);
        addProjectPage.openPageByUrl();

        RadioButton radioButton = addProjectPage.getTableProject();
        radioButton.getRadioButtonByIndexClick(2);
        Thread.sleep(1300);
    }

    @Test(description = "Домашняя работа")
    @Description("Тест RadioButtonByValue")
    public void test5() throws InterruptedException {
        loginStep.successLogin(ReadProperties.username(), ReadProperties.password());
        AddProjectPage addProjectPage = new AddProjectPage(driver);
        addProjectPage.openPageByUrl();

        RadioButton radioButton = addProjectPage.getTableProject();
        radioButton.test(3);
        Thread.sleep(1300);
    }




}
