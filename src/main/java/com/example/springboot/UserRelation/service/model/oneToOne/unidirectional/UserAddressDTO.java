//package com.example.springboot.UserRelation.service.model.oneToOne.unidirectional;
//
//import com.example.springboot.UserRelation.service.entity.oneToOne.unidirectional.Address;
//import com.example.springboot.UserRelation.service.entity.oneToOne.unidirectional.User;
//import com.fasterxml.jackson.annotation.JsonInclude;
//
//@JsonInclude(JsonInclude.Include.NON_NULL)
//public class UserAddressDTO {
//    private String status;
//    private String message;
//    private Iterable<User> user;
//    private Iterable<Address> address;
//
//    public UserAddressDTO(String status, String message, Iterable<User> user, Iterable<Address> address) {
//        this.status = status;
//        this.message = message;
//        this.user = user;
//        this.address = address;
//    }
//    public UserAddressDTO(){}
//
//    public String getStatus() {
//        return status;
//    }
//
//    public void setStatus(String status) {
//        this.status = status;
//    }
//
//    public String getMessage() {
//        return message;
//    }
//
//    public void setMessage(String message) {
//        this.message = message;
//    }
//
//    public Iterable<User> getUser() {
//        return user;
//    }
//
//    public void setUser(Iterable<User> user) {
//        this.user = user;
//    }
//
//    public Iterable<Address> getAddress() {
//        return address;
//    }
//
//    public void setAddress(Iterable<Address> address) {
//        this.address = address;
//    }
//}
