import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcTest extends BaseTest {

    @Test
    public void sumTest_1() {
        int expect = 5;
        int actualValue = calc.sum(2, 3);
        Assert.assertEquals(actualValue, expect, "Значение не одинаковое");
    }

    @Test
    public void sumTest_2() {
        int expect = 5;
        int actualValue = calc.sum(3, 3);
        Assert.assertEquals(actualValue, expect, "Значение не одинаковое");
    }

    @Test
    public void sumTest_3() {
        int expect = 5;
        int actualValue = calc.sum(2, -3);
        Assert.assertEquals(actualValue, expect, "Значение не одинаковое");
    }

    @Test
    public void sumTest_4() {
        int expect = 5;
        int actualValue = calc.sum(-2, 3);
        Assert.assertEquals(actualValue, expect, "Значение не одинаковое");
    }


}
