package com.example.springboot.repository.oneToOne.unidirectional;

import com.example.springboot.model.oneToOne.unidirectional.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
