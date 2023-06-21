import org.testng.annotations.Test;

public class PriorityTest {
    /**
     * priority - это важность выполнения тестов, приоритет запуска
     */
    @Test(priority = 1)
    public void step_a() {
        System.out.println("step_a");
    }

    @Test(priority = 2)
    public void step_b() {
        System.out.println("step_b");
    }

    @Test(priority = 3)
    public void step_c() {
        System.out.println("step_c");
    }

    @Test(priority = 4)
    public void step_12() {
        System.out.println("step_12");
    }

    @Test(priority = 5)
    public void step_9() {
        System.out.println("step_9");
    }



}
