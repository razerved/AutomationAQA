package models;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Objects;
@Builder
@ToString
public class UserBuilder {

    @EqualsAndHashCode.Exclude
    private int id;

    private String username;
    private String password;
    private String email;
    private String code;

}
