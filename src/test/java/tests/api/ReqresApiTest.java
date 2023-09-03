package tests.api;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.http.HttpStatus;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ReqresApiTest {
    static Logger logger = LogManager.getLogger(HttpClientTest.class);


    @Test
    public void simpleStepByStepApiTest(){
        // setup RestAssured
        RestAssured.baseURI = "https://reqres.in";

        // setup endpoint
        int useId = 2;
        String endpoint = "/api/users/" + useId;

        // setup request Object
        RequestSpecification httpRequest = given();

        // setup Response Object
        Response response = httpRequest.request(Method.GET, endpoint);

        // assertions
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);
        Assert.assertEquals(statusCode, HttpStatus.SC_OK);

        // get Response body
        logger.info(response.getBody().asPrettyString());
    }

    @Test
    public void simpleShortApiTest(){
        // setup RestAssured
        RestAssured.baseURI = "https://reqres.in";

        // setup endpoint
        int useId = 2;
        String endpoint = "/api/users/" + useId;

        given()
                .when()
                .get(endpoint)
                .then()
                .statusCode(HttpStatus.SC_OK)
                .log().body();

    }









}
