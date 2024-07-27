package com.example.springboot.repository.oneToOne.unidirectional;

import com.example.springboot.model.oneToOne.unidirectional.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<Address, Long> {
}
