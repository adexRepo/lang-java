package data;

import Annotation.NotBlank;

public class CreateUserRequest {
    
    @NotBlank
    private String username;

    @NotBlank
    private String password;

    private String name;

    public String getUsername() {
        return this.username;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
