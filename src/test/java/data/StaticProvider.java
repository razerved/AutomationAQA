package data;

import org.testng.annotations.DataProvider;

public class StaticProvider {

    @DataProvider(name = "Data homeWork")
    public static Object[][] dataTestHome(){
        return new Object[][]{
                { 3, 1 },
                { 2, 1 },
                { 8, 3 }
        };
    }


}
