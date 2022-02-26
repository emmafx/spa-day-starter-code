package org.launchcode.spaday.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class User {

    @Size(min = 5, max = 15, message = "Username must be between 5-15 characters")
    @NotBlank(message = "Must enter a username!")
    private String username;

    @Email(message = "Email must be in correct email format!")
    private String email;

    @Size(min = 6, message = "Password must be at least 6 characters long!")
    @NotBlank(message = "Must enter a password!")
    private String password;

    @NotBlank(message = "Confirm password field must match your password")
    private String verify;

    public User() {

    }

    public User(String username, String email, String password) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
