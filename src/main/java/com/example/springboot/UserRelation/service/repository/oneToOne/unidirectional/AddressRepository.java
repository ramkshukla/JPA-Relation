package com.example.springboot.UserRelation.service.repository.oneToOne.unidirectional;

import com.example.springboot.UserRelation.service.entity.oneToOne.unidirectional.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<Address, Long> {
}
