package com.example.springboot.repository.oneToOne.bidirectional;

import com.example.springboot.entity.oneToOne.bidirectional.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CarRepository extends CrudRepository<Car, Long> {

}
