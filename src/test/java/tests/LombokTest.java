package tests;

import helper.DataHelper;
import models.User;
import models.UserBuilder;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LombokTest {

    @Test
    public void toStringTest() {
        User user = DataHelper.getAdminUser();
        System.out.println(user.toString());
    }

    @Test
    public void equalsTest() {
        User user1 = DataHelper.getAdminUser();
        user1.setId(1);

        User user2 = DataHelper.getAdminUser();
        user2.setId(2);

        System.out.println(user1);
        System.out.println(user2);

        Assert.assertTrue(user1.equals(user2));
    }

    @Test
    public void constructorTest() {
        User user = new User(1, "sds", "sdsd", "", "dd");
        User user1 = new User("sds", "sdsd");

        System.out.println(user);
        System.out.println(user1);
    }

    @Test
    public void builderTest() {
        UserBuilder user = UserBuilder.builder()
                .id(1)
                .password("asdasd")
                .username("asdasd")
                .code("asdasdwe")
                .email("sddasd@sdad")
                .build();

        UserBuilder user1 = UserBuilder.builder()
                .id(2)
                .password("asdasd")
                .username("asdasd")
                .code("asdasdwe")
                .email("sddasd@sdad")
                .build();

        System.out.println(user);
        System.out.println(user1);

        Assert.assertTrue(user.equals(user1));
    }


}
