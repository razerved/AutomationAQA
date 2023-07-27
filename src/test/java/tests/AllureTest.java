package tests;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

@Epic("Allure examples")
@Feature("Basic Annotations")
public class AllureTest {

    @Test
    @Description("Some detailed test description.")
    public void testName_1() {
        Assert.assertTrue(true);
    }

    @Test(description = "Human-readable test name")
    public void testName_2() {
        Assert.assertTrue(true);
    }

    @Test
    @Severity(SeverityLevel.BLOCKER)
    public void testName_3() {
        Assert.assertTrue(true);
    }

    @Test
    @Story("AQA21-1234")
    public void testName_4() {
        Assert.assertTrue(true);
    }

    @Test
    @Issue("BUG-1")
    public void testName_5() {
        Assert.assertTrue(true);
    }

    @Test
    @TmsLink("TestCase-17")
    public void testName_6() {
        Assert.assertTrue(true);
    }

    @Test
    @Link("https://example.org")
    @Link(name = "allureLink", type = "myLink", url = "https://example.org")
    public void testName_7() {
        Assert.assertTrue(true);
    }
}
