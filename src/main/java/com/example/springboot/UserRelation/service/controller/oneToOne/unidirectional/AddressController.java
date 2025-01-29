//package com.example.springboot.UserRelation.service.controller.oneToOne.unidirectional;
//
//import com.example.springboot.UserRelation.service.model.oneToOne.unidirectional.UserAddressDTO;
//import com.example.springboot.UserRelation.service.oneToOne.unidirectional.AddressService;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping(path = "/address")
//public class AddressController {
//
//
//    private final AddressService addressService;
//
//    public AddressController(AddressService addressService) {
//        this.addressService = addressService;
//    }
//
//    @GetMapping
//    public UserAddressDTO getAddresses() {
//        return addressService.findAllAddresses();
//    }
//}
