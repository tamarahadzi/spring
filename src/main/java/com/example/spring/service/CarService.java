package com.example.spring.service;

import com.example.spring.model.Car;
import com.example.spring.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    @Autowired
    CarRepository carRepository;

    public void createCar(String name, String model, String gearbox, Double price, Integer year, String size){
        Car car = new Car();
        car.setName(name);
        car.setModel(model);
        car.setGearbox(gearbox);
        car.setPrice(price);
        car.setYear(year);
        car.setSize(size);
        carRepository.save(car);
    }

    public void deleteCar(Long id) {
        carRepository.deleteById(id);
    }

    public List<Car> getAllCars() {
        List<Car> cars = new ArrayList<>();
        cars = carRepository.findAll();
        return cars;
    }

    public Car getCar(Long id) {
        Car car = carRepository.getOne(id);
        return car;
    }
}
