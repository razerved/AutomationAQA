package tests;

import baseEntities.BaseTest;
import models.Project;
import models.UserBuilder;
import org.testng.annotations.Test;

public class LoginTestBuilder extends BaseTest {



    @Test
    public void shortBuilderTest() {
        Project project = new Project.Builder()
                .withProjectName("awdaw")
                .withFlag(true)
                .build();
    }


    @Test
    public void builderLogin(){
        UserBuilder userBuilder = new UserBuilder.Builder()
                .withUserEmail("email")
                .withUserPassword("pass")
                .build();

    }




}
