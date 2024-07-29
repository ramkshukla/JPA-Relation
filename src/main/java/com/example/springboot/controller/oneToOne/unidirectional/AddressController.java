package com.example.springboot.controller.oneToOne.unidirectional;

import com.example.springboot.entity.oneToOne.unidirectional.Address;
import com.example.springboot.service.oneToOne.unidirectional.AddressService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/address")
public class AddressController {


    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping
    public Iterable<Address> getAddresses() {
        return addressService.getAddresses();
    }
}
