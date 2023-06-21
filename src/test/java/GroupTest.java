import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupTest {
    @Test(groups = "smoke")
    public void step_b() {
        System.out.println("step_b");
    }

    @Test(groups = "regress")
    public void step_a() {
        System.out.println("step_a");
    }

    @Test(groups = "regress" , dependsOnGroups = "smoke")
    public void a_step_12() {
        System.out.println("astep_12");
    }

    @Test(groups = {"regress", "smoke"})
    public void step_9() {
        System.out.println("step_9");
    }



}
