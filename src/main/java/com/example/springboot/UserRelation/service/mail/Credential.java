package com.example.springboot.UserRelation.service.mail;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Credential {
    @NotNull
    private String username;

    @Size(min = 6, max = 15)
    private String password;


    public @NotNull String getUsername() {
        return username;
    }

    public void setUsername(@NotNull String username) {
        this.username = username;
    }

    public @Size(min = 15, max = 6) String getPassword() {
        return password;
    }

    public void setPassword(@Size(min = 15, max = 6) String password) {
        this.password = password;
    }
}
