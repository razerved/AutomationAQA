package tests;

import baseEntities.BaseTest;
import org.testng.annotations.Test;
import utils.configuration.ReadProperties;

public class NavigationTest extends BaseTest {




    @Test
    public void test(){
        driver.get(ReadProperties.getUrl());
    }


}
