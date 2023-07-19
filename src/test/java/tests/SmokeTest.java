package tests;

import baseEntities.BaseTest;
import org.testng.annotations.Test;
import utils.configuration.ReadProperties;

public class SmokeTest extends BaseTest {


    @Test
    public void testStep1() {
        driver.get(ReadProperties.getUrl());
    }

    @Test(dependsOnMethods = "testStep1")
    public void testStep2() {
        driver.get(ReadProperties.getUrl());
    }

    @Test(dependsOnMethods = "testStep2")
    public void testStep3() {
        driver.get(ReadProperties.getUrl());
    }



}
