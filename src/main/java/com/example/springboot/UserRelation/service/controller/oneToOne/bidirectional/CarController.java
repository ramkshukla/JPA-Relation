package com.example.springboot.UserRelation.service.controller.oneToOne.bidirectional;


import com.example.springboot.UserRelation.service.entity.oneToOne.bidirectional.Car;
import com.example.springboot.UserRelation.service.oneToOne.bidirectional.CarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/car")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public Iterable<Car> getCars() {
        return carService.findCar();
    }
}
