package com.example.springboot.service.oneToOne;

import com.example.springboot.model.oneToOne.unidirectional.Address;
import com.example.springboot.model.oneToOne.unidirectional.User;
import com.example.springboot.repository.oneToOne.unidirectional.AddressRepository;
import com.example.springboot.repository.oneToOne.unidirectional.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final AddressRepository addressRepository;

    public UserService(UserRepository userRepository, AddressRepository addressRepository) {
        this.userRepository = userRepository;
        this.addressRepository = addressRepository;
    }

    public Iterable<Address> getUser() {
        return addressRepository.findAll();
    }
}
