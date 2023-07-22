package homeWork;

import baseEntities.BaseTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.ActionTest;

import java.io.File;
import java.util.List;


public class TestHW extends BaseTest {


    @Test
    public void contextMenu() {
        driver.get("http://the-internet.herokuapp.com/context_menu");
        actions.moveToElement(waitService.waitForExists(By.id("hot-spot")))
                .contextClick()
                .build()
                .perform();
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "You selected a context menu");
        alert.accept();

    }

    @Test
    public void dynamicControls() {
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");
        WebElement checkBox = waitService.waitForVisibilityLocatedBy(By.id("checkbox"));
        waitService.waitForExists(By.cssSelector("div + button")).click();

        Assert.assertTrue(waitService.waitForElementInvisible(checkBox));
        Assert.assertEquals(waitService.waitForVisibilityLocatedBy(By.id("message")).getText(),
                "It's gone!");
        WebElement input = waitService.waitForExists(By.cssSelector("input[type='text']"));
        Assert.assertTrue(input.getAttribute("disabled").equals("true"));
        waitService.waitForExists(By.cssSelector(" input +button[type='button']")).click();
        Assert.assertEquals(waitService.waitForVisibilityLocatedBy(By.cssSelector("p#message")).getText(),
                "It's enabled!");
        Assert.assertTrue(input.isEnabled());
    }

    @Test
    public void fileUpload() {
        driver.get("http://the-internet.herokuapp.com/upload");
        WebElement fileUploadElement = waitService.waitForExists(By.xpath("//form/input[@type='file']"));
        String pathToFile = ActionTest.class.getClassLoader().getResource("deadpoll2.jpg").getPath()
                .replace("/", "\\").substring(1);
        System.out.println(pathToFile);
        fileUploadElement.sendKeys(pathToFile);
        String text = driver.findElement(By.id("file-upload")).getText();
        waitService.waitForVisibilityLocatedBy(By.id("file-submit")).submit();
        Assert.assertEquals(waitService.waitForVisibilityLocatedBy(By.id("uploaded-files")).getText()
                , "deadpoll2.jpg");

    }

    @Test
    public void frames() {
        driver.get("http://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame("mce_0_ifr");
        Assert.assertEquals(waitService.waitForExists(By.cssSelector("p")).getText()
                , "Your content goes here.");

    }

    @Test
    public void fileDownload() {
        driver.get("http://the-internet.herokuapp.com/download");
        List<WebElement> list = waitService.waitForAllVisibleElementsLocatedBy(By.cssSelector("a[href^='down']"));
        WebElement el = list.get(1);
        String nameFile = el.getText();
        el.click();

        File folder = new File(System.getProperty("user.dir"));

        //List the files on that folder
        File[] listOfFiles = folder.listFiles();
        boolean found = false;
        File f = null;
        //Look for the file in the files
        // You should write smart REGEX according to the filename
        for (File listOfFile : listOfFiles) {
            if (listOfFile.isFile()) {
                String fileName = listOfFile.getName();
                System.out.println("File " + listOfFile.getName());
                if (fileName.matches(nameFile)) {
                    f = new File(fileName);
                    found = true;
                }
            }
        }
        Assert.assertTrue(found, "Downloaded document is not found");
        f.deleteOnExit();
    }


}
