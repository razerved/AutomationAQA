import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class CalcTest extends BaseTest {

    @Test
    public void sumTest_1() {
        int expect = 5;
        int actualValue = calculate.sum(2, 3);
        Assert.assertEquals(actualValue, expect, "sumTest_1 Значение не одинаковое");
    }

    @Test(enabled = false)
    public void sumTest_2() {
        int expect = 5;
        int actualValue = calculate.sum(3, 3);
        Assert.assertEquals(actualValue, expect, " sumTest_2 Значение не одинаковое");
    }

    @Test(description = "Опсание теста появляется в отчете")
    public void sumTest_3() throws InterruptedException {
        int expect = 5;
        int actualValue = calculate.sum(2, -3);
        Thread.sleep(2000);
        Assert.assertEquals(actualValue, expect, "sumTest_3 Значение не одинаковое");
    }

    @Test(testName = "Название теста отображающегося в Run")
    public void sumTest_4() {
        int expect = 5;
        int actualValue = calculate.sum(-2, 3);
        Assert.assertEquals(actualValue, expect, "sumTest_4 Значение не одинаковое");
    }
    @Test(timeOut = 2000)// привысет время заявленное - автоматически считается упавшим (в МилиСек)
    public void sumTest_5() {
        int expect = 5;
        int actualValue = calculate.sum(-2, 3);
        Assert.assertEquals(actualValue, expect, "sumTest_5 Значение не одинаковое");
    }
    @Test(invocationCount = 2, invocationTimeOut = 1000, threadPoolSize = 3) // запускается столько сколько указано (2*),
    // за какое время должны все тесты выполниться
    // разбивает на кол-ао потоков
    public void sumTest_6() throws InterruptedException {
        int expect = 5;
        int actualValue = calculate.sum(-2, 3);
        Thread.sleep(2000);
        Assert.assertEquals(actualValue, expect, "sumTest_6 Значение не одинаковое");
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void sumTest_7() throws InterruptedException {
        List expect = null;
        int size = expect.size();
        Thread.sleep(2000);
        Assert.assertEquals( expect, "sumTest_7 Значение не одинаковое");
    }


}
