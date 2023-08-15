package models;

import lombok.*;

import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String username;
    private String password;
    private String email;
    private String code;

    public static class Builder{
        private User newUser;

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


        public User build() {
            return newUser;
        }
    }

}
