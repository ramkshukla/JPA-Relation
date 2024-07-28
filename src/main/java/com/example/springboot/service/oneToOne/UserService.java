package com.example.springboot.service.oneToOne;

import com.example.springboot.model.oneToOne.unidirectional.User;
import com.example.springboot.repository.oneToOne.unidirectional.AddressRepository;
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
