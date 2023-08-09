package helper;

import models.Project;
import models.User;
import models.UserBuilder;
import utils.configuration.ReadProperties;

public class DataHelper {
    public static User getAdminUser() {
        User user = new User();
        user.setEmail(ReadProperties.username());
        user.setPassword(ReadProperties.password());

        return user;
    }

    public static User getStandartUser() {
        User user = new User();
        user.setEmail(ReadProperties.username());
        user.setPassword(ReadProperties.password());

        return user;
    }

   public static Project getCommonProject(){
        Project project = new Project.Builder()
                .withProjectName("name")
                .withAnnouncement("jsjx")
                .withProjectType(25)
                .build();
        return project;
    }

    public static UserBuilder getBuilderUser(){
        UserBuilder newBuildUser = new UserBuilder.Builder()
                .withUserEmail(ReadProperties.username())
                .withUserPassword(ReadProperties.password())
                .build();
        return newBuildUser;
    }
}
