package models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode
@ToString
public class UserBuilder {
    private String username;
    private String password;
    private String email;


    public static class Builder{
        private UserBuilder newUser;

        public Builder(){
            this.newUser = newUser;
        }


        public Builder withUserName(String userName){
            newUser.username = userName;
            return this;
        }
        public Builder withUserPassword(String userPassword){
            newUser.password = userPassword;
            return this;
        }

        public Builder withUserEmail(String userEmail){
            newUser.email = userEmail;
            return this;
        }

        public UserBuilder build() {
            return newUser;
        }
    }


}
