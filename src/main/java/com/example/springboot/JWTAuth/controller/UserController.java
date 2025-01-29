package com.example.springboot.JWTAuth.controller;


import com.example.springboot.JWTAuth.entity.UserJWT;
import com.example.springboot.JWTAuth.services.UserServices;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/users")
@RestController
public class UserController {
    private final UserServices userService;

    public UserController(UserServices userService) {
        this.userService = userService;
    }

    @GetMapping("/me")
    public ResponseEntity<UserJWT> authenticatedUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        UserJWT currentUser = (UserJWT) authentication.getPrincipal();

        return ResponseEntity.ok(currentUser);
    }

    @GetMapping
    public ResponseEntity<List<UserJWT>> allUsers() {
        List<UserJWT> users = userService.allUsers();

        return ResponseEntity.ok(users);
    }
}
