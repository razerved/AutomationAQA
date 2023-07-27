package tests;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

@Epic("Allure examples")
@Feature("Advanced Annotations")
public class Allure1Test {

    @Test
    @Story("AQA21-5678")
    public void testName_4() {
        Assert.assertTrue(true);
    }
}
