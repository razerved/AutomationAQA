import data.StaticProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.*;

public class HomeWorkTest extends BaseTest {

    @Test(description = "disabled test", enabled = false)
    public void homeTest1(){
        int exp = 3;
        int actual = calculate.homeMines(2, 3);
        assertEquals(actual,exp, "homeTest1 не верно");
    }



    @Test(invocationTimeOut = 100, invocationCount = 2, testName = "Ограничение времени invocationTimeOut")
    public void homeTest3() throws InterruptedException {
        Thread.sleep(50);
        assertEquals(calculate.homeMines(2, 3),-1, "homeTest3 не верно");
    }



    @Test(groups = "Lor", testName = "Lor тест")
    public void homeTest2(){
        assertEquals(calculate.homeMines(3, 1),2, "homeTest2 не верно");
    }
    @Test(groups = "San", dependsOnGroups = "Lor", invocationCount = 2, testName = "Зависящий от Lor всегда" +
            " выполняется 2жды", alwaysRun = true)
    public void homeTest4(){
        int exp = 1;
        assertEquals(calculate.homeMines(2, 1),exp, "homeTest4 не верно");
    }
    @Test(groups = "San", dependsOnGroups = "Lor", testName = "Зависящий2 от Lor")
    public void homeTest5(){
        assertEquals(calculate.homeMines(2, 1),1, "homeTest5 не верно");
    }




    @Test(dataProvider = "Data homeWork", dataProviderClass = StaticProvider.class, testName = "Данные из StaticProvide")
    public void homeTest6(int a , int b){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(calculate.homeMines(a,b),2, "homeTest6 не верно");
        softAssert.assertEquals(calculate.homeMines(a,b),1, "homeTest6 не верно");
        softAssert.assertEquals(calculate.homeMines(a,b),5, "homeTest6 не верно");
    }




    @Parameters({"homeLogin", "homePassword"})
    @Test(testName = "Параметризированый XML")
    public void homeWorkTestParamXML(String log, String pass){
        System.out.println("Login: " + log + "\n" +
                "Pass: " + pass);
        System.out.println("завалится при зпуске Run класса");
    }







    @Test(testName = "Деление на 0 double")
    public void homeTest7(){
        assertEquals(calculate.homeDoubleDivisionByZero(0d, 0), Double.NaN, "homeTest7 не верно");
    }


    @Test(testName = "Деление на 0 int" , expectedExceptions = ArithmeticException.class)
    public void homeTest8(){
        assertEquals(calculate.homeIntDivisionByZero(1 , 0),ArithmeticException.class, "homeTest8 не верно");
    }

    @Test(testName = "Деление положительное double")
    public void homeTest9(){
        assertEquals(calculate.homeDoubleDivisionByZero(8.5, 2.5), 3.4, "homeTest9 не верно");
    }

    @Test(testName = "Деление положительное int" )
    public void homeTest10(){
        assertEquals(calculate.homeIntDivisionByZero(5 , 2),2, "homeTest10 не верно");
    }



}
