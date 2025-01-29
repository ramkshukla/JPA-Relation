package com.example.springboot.UserRelation.service.oneToOne.bidirectional;

import com.example.springboot.UserRelation.service.entity.oneToOne.bidirectional.Car;
import com.example.springboot.UserRelation.service.repository.oneToOne.bidirectional.CarRepository;
import org.springframework.stereotype.Service;

@Service
public class CarService{

     final CarRepository carRepository;

     public CarService(CarRepository carRepository) {
         this.carRepository = carRepository;
     }

     public Iterable<Car> findCar() {
         return carRepository.findAll();
     }
}
