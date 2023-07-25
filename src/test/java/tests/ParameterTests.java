package tests;

import baseEntities.BaseTest;
import org.testng.annotations.Test;

public class ParameterTests extends BaseTest {

    @Test
    public void infoAlertTest() {
        System.out.println(System.getProperty("testProp"));
    }
}