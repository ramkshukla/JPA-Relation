package com.example.springboot.JWTAuth.services;

import com.example.springboot.JWTAuth.entity.UserJWT;
import com.example.springboot.JWTAuth.repository.UserJWTRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServices {

    @Autowired
    private  UserJWTRepository userJWTRepository;


    public List<UserJWT> allUsers() {
        List<UserJWT> users = new ArrayList<>();

        userJWTRepository.findAll().forEach(users::add);

        return users;
    }
}
