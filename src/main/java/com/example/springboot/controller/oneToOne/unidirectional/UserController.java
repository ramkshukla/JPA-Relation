package com.example.springboot.controller.oneToOne.unidirectional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    @GetMapping
    public static String getName(){
        return  "User";
    }
}
