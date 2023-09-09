package tests.api;

import adapters.ProjectAdapter;
import baseEntities.BaseApiTest;
import helpers.GsonHelpers;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import models.Project;
import org.apache.http.HttpStatus;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class TestRailApiTest1 extends BaseApiTest {
    static Logger logger = LogManager.getLogger(TestRailApiTest1.class);


    @Test
    public void addProjectTest1(){
        String endpoint = "/index.php?/api/v2/add_project";

        logger.info(token);

        Project expectedProject = new Project();
        expectedProject.setProjectName("WP_Project_03");
        expectedProject.setAnnouncement("This is a description!!!");
        expectedProject.setFlag(true);
        expectedProject.setProjectType(1);

        given()
                .body(String.format("{\n" +
                        "  \"name\": \"%s\",\n" +
                        "  \"announcement\": \"%s\",\n" +
                        "  \"show_announcement\": %b,\n" +
                        "  \"suite_mode\" : %d\n" +
                        "}",
                        expectedProject.getProjectName(),
                        expectedProject.getAnnouncement(),
                        expectedProject.isFlag(),
                        expectedProject.getProjectType()
                ))
                .when()
                .post(endpoint)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK);

    }

    @Test
    public void addProjectTestForMap2(){

        String endpoint = "/index.php?/api/v2/add_project";

        Project expectedProject = new Project();
        expectedProject.setProjectName("WP_Project_04");
        expectedProject.setAnnouncement("This is a description!!!");
        expectedProject.setFlag(true);
        expectedProject.setProjectType(2);

        Map<String, Object> jsonMap = new HashMap<>();
        jsonMap.put("name", expectedProject.getProjectName());
        jsonMap.put("suite_mode", expectedProject.getProjectType());


        given()
                .body(jsonMap)
                .when()
                .post(endpoint)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK);

    }

    @Test
    public void addProjectTestForSterilization3(){

        String endpoint = "/index.php?/api/v2/add_project";

        Project expectedProject = new Project();
        expectedProject.setProjectName("WP_Project_05");
        expectedProject.setAnnouncement("This is a description!!!");
        expectedProject.setFlag(true);
        expectedProject.setProjectType(3);


        given()
                .body(expectedProject, ObjectMapperType.GSON) //by Default используется анотация Jackson
                .log().all()
                .when()
                .post(endpoint)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK);

    }

    @Test
    public void addProjectTestForSterilization4(){

        String endpoint = "/index.php?/api/v2/add_project";

        Project expectedProject = new Project();
        expectedProject.setProjectName("WP_Project_06");
        expectedProject.setAnnouncement("This is a description!!!");
        expectedProject.setFlag(true);
        expectedProject.setProjectType(3);


        new ProjectAdapter().add(expectedProject);

    }

    @Test
    public void addProjectTest5(){

        String endpoint = "/index.php?/api/v2/add_project";

        Project expectedProject = new Project();
        expectedProject.setProjectName("WP_Project_06");
        expectedProject.setAnnouncement("This is a description!!!");
        expectedProject.setFlag(true);
        expectedProject.setProjectType(3);


        Response response = new ProjectAdapter().add2(expectedProject);
        Project actualProject = GsonHelpers.getProjectFromJson(response.getBody().asString());
        System.out.println(actualProject.toString());

    }

    @Test
    public void addProjectTestForSterilization5(){

        String endpoint = "/index.php?/api/v2/add_project";

        Project expectedProject = new Project();
        expectedProject.setProjectName("WP_Project_07");
        expectedProject.setAnnouncement("This is a description!!!");
        expectedProject.setFlag(true);
        expectedProject.setProjectType(2);


        int id = given()
                .body(expectedProject, ObjectMapperType.GSON)
                .log().all()
                .when()
                .post(endpoint)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .jsonPath()
                .getInt("id");

        logger.info(id);

    }

    @Test
    public void addProjectTestForSterilization6(){

        String endpoint = "/index.php?/api/v2/add_project";

        Project expectedProject = new Project();
        expectedProject.setProjectName("WP_Project_07");
        expectedProject.setAnnouncement("This is a description!!!");
        expectedProject.setFlag(true);
        expectedProject.setProjectType(2);


        Response response = given()
                .body(expectedProject, ObjectMapperType.GSON)
                .log().all()
                .when()
                .post(endpoint)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .response();

        int id = response.getBody().jsonPath().getInt("id");
        Assert.assertEquals(expectedProject.getProjectName(),
                response.getBody().jsonPath().getString("name"));
        logger.info(id);

    }

    @Test
    public void addProjectTest7(){

        String endpoint = "/index.php?/api/v2/add_project";

        Project expectedProject = new Project();
        expectedProject.setProjectName("WP_Project_07");
        expectedProject.setAnnouncement("This is a description!!!");
        expectedProject.setFlag(true);
        expectedProject.setProjectType(2);

        Response response = given()
                .body(expectedProject, ObjectMapperType.GSON)
                .log().all()
                .when()
                .post(endpoint)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK)
                .body("name", is(expectedProject.getProjectName()))
                .extract()
                .response();

    }
















}