import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParametrizeTest extends BaseTest{

    /**
     * indices = 2 - используется для передачи конкретного набора
     * parallel = true - добавляется при управлении потоками
     */
    @DataProvider(name = "Data for sum", parallel = true, indices = 2 )
    public Object[][] inputSome() {
        return new Object[][]{
                {-2, -3, -5},
                {0, 0, 0},
                {-1, 2, 4},
                {-9, 5, -6}
        };
    }

    /**
     * threadPoolSize = 2 - управление потоками
     */
    @Test(dataProvider = "Data for sum", threadPoolSize = 2)
    //если в отдельном класск то (dataProvider = "Data for sum",
    // dataProviderClass = PriorityTest.class )
    public void dataProviderTest(int a, int b, int expected) {
        Assert.assertEquals(calculate.sum(a, b), expected, "sumTest_5 Значение не одинаковое");
    }


}
