package com.example.springboot.service.oneToOne.bidirectional;

import com.example.springboot.entity.oneToOne.bidirectional.Car;
import com.example.springboot.repository.oneToOne.bidirectional.CarRepository;
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
