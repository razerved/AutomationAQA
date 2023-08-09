package models;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserBuilder user = (UserBuilder) o;
        return Objects.equals(username, user.username) && Objects.equals(password, user.password) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password, email);
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


}
