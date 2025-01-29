package com.example.springboot.UserRelation.service.oneToOne.unidirectional;

import com.example.springboot.UserRelation.service.model.oneToOne.unidirectional.UserAddressDTO;
import com.example.springboot.UserRelation.service.repository.oneToOne.unidirectional.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;

    }

    public UserAddressDTO getUser() {
        UserAddressDTO userAddressDTO = new UserAddressDTO();
        userAddressDTO.setMessage("Data Fetched Successfully");
        userAddressDTO.setStatus("200");
        userAddressDTO.setUser(userRepository.findAll());
        return userAddressDTO;
    }
}
