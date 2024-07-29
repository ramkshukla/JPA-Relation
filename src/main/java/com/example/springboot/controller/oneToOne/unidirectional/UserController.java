package com.example.springboot.controller.oneToOne.unidirectional;

import com.example.springboot.entity.oneToOne.unidirectional.User;
import com.example.springboot.service.oneToOne.unidirectional.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/users")
public class UserController {

    private final  UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public  Iterable<User> getUsers(){
        return  userService.getUser();
    }
}
