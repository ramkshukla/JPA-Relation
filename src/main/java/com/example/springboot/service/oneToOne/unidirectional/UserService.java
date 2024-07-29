package com.example.springboot.service.oneToOne.unidirectional;

import com.example.springboot.entity.oneToOne.unidirectional.User;
import com.example.springboot.repository.oneToOne.unidirectional.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;

    }

    public Iterable<User> getUser() {
        return userRepository.findAll();
    }
}
