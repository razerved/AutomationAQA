package tests.api;

import baseEntities.BaseApiTest;
import com.google.gson.Gson;
import io.restassured.response.Response;
import models.User;
import org.apache.http.HttpStatus;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.json.TypeToken;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Endpoints;

import javax.xml.transform.Source;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class TestRailApiTest2 extends BaseApiTest {
    static Logger logger = LogManager.getLogger(TestRailApiTest2.class);


    @Test
    public void testAllUsers() {
        User expected = User.builder()
                .name("Alex Trostyanko")
                .email("atrostyanko@gmail.com")
                .isActive(true)
                .roleId(1)
                .role("Lead")
                .build();

        given()
                .when()
                .get(Endpoints.GET_ALL_USERS)
                .then()
                .log().body()
                .body("get(0).name", is(expected.getName()))
                .body("get(0).email", equalTo(expected.getEmail()))
                .statusCode(HttpStatus.SC_OK);

    }

    @Test
    public void testGetUser() {
        int userId = 1;

        User expectedUser = User.builder()
                .name("Alex Trostyanko")
                .email("atrostyanko@gmail.com")
                .isActive(true)
                .roleId(1)
                .role("Lead")
                .build();

        User actualUser = given()
                .pathParam("user_id", userId)
                .get(Endpoints.GET_USER)
                .then()
                .log().body()
                .assertThat()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .as(User.class);

        System.out.println(actualUser.toString());
        Assert.assertTrue(expectedUser.equals(actualUser));

    }

    @Test //синоним теста testGetUser
    public void testGetUser1() {
        int userId = 1;
        Gson gson = new Gson();

        User expectedUser = User.builder()
                .name("Alex Trostyanko")
                .email("atrostyanko@gmail.com")
                .isActive(true)
                .roleId(1)
                .role("Lead")
                .build();

        Response response = given()
                .pathParam("user_id", userId)
                .get(Endpoints.GET_USER);

        User actualUser = gson.fromJson(response.getBody().asString(), User.class);
        System.out.println(actualUser.toString());
        Assert.assertTrue(expectedUser.equals(actualUser));

    }

    @Test // получаем массив Users
    public void testAllUsers1() {
        Gson gson = new Gson();


        User expectedUsers = User.builder()
                .name("Alex Trostyanko")
                .email("atrostyanko@gmail.com")
                .isActive(true)
                .roleId(1)
                .role("Lead")
                .build();

        Response response = given()
                .when()
                .get(Endpoints.GET_ALL_USERS);


        User[] actualUsers = gson.fromJson(response.getBody().asString(), User[].class);

        User actulUser = new User();
        for (User user : actualUsers) {
            if (user.getId() == 1) {
                actulUser = user;
            }
        }
        Assert.assertEquals(actualUsers[0], expectedUsers);
        Assert.assertEquals(actulUser, expectedUsers);

    }

    @Test // получаем Коллекция Users
    public void testAllUsers2() {
        Gson gson = new Gson();


        User expectedUsers = User.builder()
                .name("Alex Trostyanko")
                .email("atrostyanko@gmail.com")
                .isActive(true)
                .roleId(1)
                .role("Lead")
                .build();

        Response response = given()
                .when()
                .get(Endpoints.GET_ALL_USERS);


        Type listtype = new TypeToken<ArrayList<User>>(){}.getType();
        List<User> actualList = gson.fromJson(response.getBody().asString(), listtype);

        Assert.assertEquals(actualList.get(0), expectedUsers);

    }



}
