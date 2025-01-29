package com.example.springboot.JWTAuth.repository;

import com.example.springboot.JWTAuth.entity.UserJWT;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserJWTRepository extends CrudRepository<UserJWT, Integer> {
    Optional<UserJWT> findByEmail(String email);
}
