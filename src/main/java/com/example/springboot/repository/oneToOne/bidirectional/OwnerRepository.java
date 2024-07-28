package com.example.springboot.repository.oneToOne.bidirectional;

import com.example.springboot.model.oneToOne.bidirectional.Owner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
