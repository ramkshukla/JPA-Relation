package com.example.springboot.JWTAuth.controller;

import com.example.springboot.JWTAuth.dtos.LoginResponse;
import com.example.springboot.JWTAuth.dtos.LoginUserDto;
import com.example.springboot.JWTAuth.dtos.RegisterUserDTOS;
import com.example.springboot.JWTAuth.entity.UserJWT;
import com.example.springboot.JWTAuth.services.AuthenticationService;
import com.example.springboot.JWTAuth.services.JWTServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/auth")
@RestController
public class AuthenticationController {
    private final JWTServices jwtService;

    private final AuthenticationService authenticationService;

    public AuthenticationController(JWTServices jwtService, AuthenticationService authenticationService) {
        this.jwtService = jwtService;
        this.authenticationService = authenticationService;
    }

    @PostMapping("/signup")
    public ResponseEntity<UserJWT> register(@RequestBody RegisterUserDTOS registerUserDto) {
        UserJWT registeredUser = authenticationService.signup(registerUserDto);

        return ResponseEntity.ok(registeredUser);
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> authenticate(@RequestBody LoginUserDto loginUserDto) {
        UserJWT authenticatedUser = authenticationService.authenticate(loginUserDto);

        String jwtToken = jwtService.generateToken(authenticatedUser);

        LoginResponse loginResponse = new LoginResponse();
        loginResponse.setToken(jwtToken);
        loginResponse.setExpiresIn(jwtService.getExpirationTime());

        return ResponseEntity.ok(loginResponse);
    }

}
