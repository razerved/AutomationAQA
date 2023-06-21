import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTest {
    private int attem = 1;

    @Test(/*retryAnalyzer = Retry.class*/)
    public void flakyTest(){
        if (attem ==6){
            Assert.assertTrue(true);
        }else {
            attem ++;
            System.out.println(" Attem: " + attem);
            throw  new NullPointerException();
        }
    }



}
