package baseEntities;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.apache.http.protocol.HTTP;
import org.testng.ITestContext;
import org.testng.annotations.*;
import utils.configuration.ReadProperties;

import static io.restassured.RestAssured.given;


@Listeners(InvokedListener.class)
//@Listeners(value = Listener.class)
public class BaseApiTest {

    protected String token;


    @BeforeTest
    public void setUpURIApi(ITestContext iTestContext) {
        RestAssured.baseURI = ReadProperties.getUrl();
        //если обьявить как static token, то тогда не нужно выводить в
        //BeforeClass и во всех тестах он будет не null - разве нет?
        //опятьже это при условии, что только часть опеределнных тестов в разных классах будет использовать
        //token а не все тесты будут подвязанны

        RestAssured.requestSpecification = given()
                .auth().preemptive().basic(ReadProperties.username(), ReadProperties.password())
                .header(HTTP.CONTENT_TYPE, ContentType.JSON);

    }

    @BeforeClass
    public void setupApi(ITestContext iTestContext) {

        token = "aaa";

    }


    /*@AfterTest
    public void tearDown(ITestResult result) {
        if (!result.isSuccess()){
            System.out.println("Make screenshot");
        }

    }*/



}
