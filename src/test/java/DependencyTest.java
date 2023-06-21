import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTest {
    /**
     * Последовательность запуска
     * step_b выполнится только после выполнения step_a
     * depends важнее priority
     */
    @Test
    public void step_b() {
        System.out.println("step_b");
    }

    /**
     * Цепочка легко разрушится если тест упадет
     * последующие тесты будут Ignored
     */
    @Test(dependsOnMethods = "step_b")
    public void step_a() {
        System.out.println("step_a");
        Assert.assertTrue(false);
    }

    /**
     * Если придыдущий шаг был завален
     * alwaysRun = true, будет выполнен
     */
    @Test(dependsOnMethods = "step_9", priority = 1, alwaysRun = true)
    public void a_step_12() {
        System.out.println("astep_12");
    }

    @Test(dependsOnMethods = {"step_a", "step_b"})
    public void step_9() {
        System.out.println("step_9");
    }


}
