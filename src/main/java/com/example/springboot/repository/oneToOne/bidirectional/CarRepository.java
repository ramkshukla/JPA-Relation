package com.example.springboot.repository.oneToOne.bidirectional;

import com.example.springboot.model.oneToOne.bidirectional.Car;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends CrudRepository<Car, Long> {

}
