import org.testng.annotations.*;
@Listeners(Listener.class)
public class BaseTest {

    protected Calculator calculate;

    @BeforeClass
    public void beforeClass() {
        System.out.println("This BeforeClass");
        calculate = new Calculator();
        calculate.setLevel(getClass().toString());
    }

    @BeforeGroups
    public void beforeGroup() {
        System.out.println("This BeforeGroup");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("This BeforeTest");

    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("This BeforeMethod");
    }

    @BeforeSuite
    public void beforeSuet() {
        System.out.println("This BeforeSuet");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("This afterClass");
    }

    @AfterGroups
    public void afterGroup() {
        System.out.println("This afterGroup");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("This afterTest");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("This afterMethod");
    }

    @AfterSuite
    public void afterSuet() {
        System.out.println("This afterSuet");
    }


}
