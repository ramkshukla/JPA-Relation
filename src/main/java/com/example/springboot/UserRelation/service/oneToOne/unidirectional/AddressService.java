//package com.example.springboot.UserRelation.service.oneToOne.unidirectional;
//
//import com.example.springboot.UserRelation.service.model.oneToOne.unidirectional.UserAddressDTO;
//import com.example.springboot.UserRelation.service.repository.oneToOne.unidirectional.AddressRepository;
//import org.springframework.stereotype.Service;
//
//@Service
//public class AddressService {
//    private  final AddressRepository addressRepository;
//
//    AddressService(AddressRepository addressRepository) {
//        this.addressRepository = addressRepository;
//    }
//
//    public UserAddressDTO findAllAddresses() {
//        UserAddressDTO userAddressDTO = new UserAddressDTO();
//        userAddressDTO.setStatus("200");
//        userAddressDTO.setMessage("Data Fetched Successfully");
//        userAddressDTO.setAddress(addressRepository.findAll());
//        return userAddressDTO;
//    }
//}
