import org.testng.annotations.*;
//@Listeners(Listener.class) - если для отдельного класса
public class AUnitTest extends BaseTest {

    @Test
    public void firstTest_1() {
        System.out.println("1 Hello World!");
    }

    @Test
    public void firstTest_2() {
        System.out.println("2 Hello World!");
    }




}
