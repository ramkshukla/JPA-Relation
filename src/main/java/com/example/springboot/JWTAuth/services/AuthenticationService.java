package com.example.springboot.JWTAuth.services;

import com.example.springboot.JWTAuth.dtos.LoginUserDto;
import com.example.springboot.JWTAuth.dtos.RegisterUserDTOS;
import com.example.springboot.JWTAuth.entity.UserJWT;
import com.example.springboot.JWTAuth.repository.UserJWTRepository;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    private final UserJWTRepository userJWTRepository;

    private final PasswordEncoder passwordEncoder;

    private final AuthenticationManager authenticationManager;

    public AuthenticationService(
            UserJWTRepository userRepository,
            AuthenticationManager authenticationManager,
            PasswordEncoder passwordEncoder
    ) {
        this.authenticationManager = authenticationManager;
        this.userJWTRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public UserJWT signup(RegisterUserDTOS input) {
        UserJWT user = new UserJWT();
        user.setFullName(input.getFullName());
        user.setEmail(input.getEmail());
        user.setPassword(passwordEncoder.encode(input.getPassword()));

        return userJWTRepository.save(user);
    }

    public UserJWT authenticate(LoginUserDto input) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        input.getEmail(),
                        input.getPassword()
                )
        );

        return userJWTRepository.findByEmail(input.getEmail())
                .orElseThrow();
    }
}
