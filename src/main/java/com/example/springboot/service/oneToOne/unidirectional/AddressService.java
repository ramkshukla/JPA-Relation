package com.example.springboot.service.oneToOne.unidirectional;

import com.example.springboot.entity.oneToOne.unidirectional.Address;
import com.example.springboot.repository.oneToOne.unidirectional.AddressRepository;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    private  final AddressRepository addressRepository;

    AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public Iterable<Address> getAddresses() {
        return addressRepository.findAll();
    }
}
