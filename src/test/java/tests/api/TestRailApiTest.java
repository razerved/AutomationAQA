package tests.api;

import baseEntities.BaseApiTest;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.http.HttpStatus;
import org.apache.http.protocol.HTTP;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.configuration.ReadProperties;

import static io.restassured.RestAssured.given;

public class TestRailApiTest extends BaseApiTest {
    static Logger logger = LogManager.getLogger(TestRailApiTest.class);




    @Test
    public void getAllUsersStepByStep(){
        String endpoint = "/index.php?/api/v2/get_users";

        logger.info(token);

        RequestSpecification httpRequest = given();
        httpRequest.header(HTTP.CONTENT_TYPE, ContentType.JSON);

        httpRequest.auth().preemptive().basic(ReadProperties.username(), ReadProperties.password());

        logger.info(httpRequest.log().all());
        Response response = httpRequest.request(Method.GET, endpoint);

        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);

        logger.info(response.getBody().asPrettyString());

    }


    @Test
    public void getAllUsersSmall(){
        String endpoint = "/index.php?/api/v2/get_users";

        logger.info(token);

        given()
                .auth().preemptive().basic(ReadProperties.username(), ReadProperties.password())
                .header(HTTP.CONTENT_TYPE, ContentType.JSON)
                .when()
                .get(endpoint)
                .then()
                .log().status()
                .log().body()
                .statusCode(HttpStatus.SC_OK);

    }









}
