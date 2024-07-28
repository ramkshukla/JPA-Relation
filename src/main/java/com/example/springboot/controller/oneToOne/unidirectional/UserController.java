package com.example.springboot.controller.oneToOne.unidirectional;

import com.example.springboot.model.oneToOne.unidirectional.Address;
import com.example.springboot.model.oneToOne.unidirectional.User;
import com.example.springboot.service.oneToOne.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    private final  UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public static String getName(){
        return  "User";
    }

    @GetMapping(path = "/all")
    public  Iterable<Address> getUsers(){
        return  userService.getUser();
    }
}
