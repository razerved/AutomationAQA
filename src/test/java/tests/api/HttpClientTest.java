package tests.api;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class HttpClientTest {
    static Logger logger = LogManager.getLogger(HttpClientTest.class);

    @Test
    public void simpleAPITest() throws IOException {
        String restUrl = "https://reqres.in/api/users/2";

        //create an Object and pass URL
        HttpUriRequest request = new HttpGet(restUrl);

        //send the request
        HttpResponse httpResponse = HttpClientBuilder
                .create()
                .build()
                .execute(request);

        logger.info(request);
        logger.info(httpResponse);

        Assert.assertEquals(httpResponse.getStatusLine().getStatusCode(),
                HttpStatus.SC_OK);
    }







}
