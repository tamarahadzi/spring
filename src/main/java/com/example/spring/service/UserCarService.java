package com.example.spring.service;

import com.example.spring.model.UserCar;
import com.example.spring.repository.UserCarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.List;

@Service
public class UserCarService {

    @Autowired
    UserCarRepository userCarRepository;

    public void createUserCar(Long userId, Long carId, Timestamp startDate, Timestamp endDate) {
        UserCar userCar = new UserCar();
        userCar.setCarId(carId);
        userCar.setUserId(userId);
        userCar.setStartDate(startDate);
        userCar.setEndDate(endDate);
        userCarRepository.save(userCar);
    }

    public void deleteUserCar(Long id) {
        userCarRepository.deleteById(id);
    }

    public UserCar getUserCar(Long id) {
        return userCarRepository.getOne(id);
    }

    public List<UserCar> getUserCars() {
        return userCarRepository.findAll();
    }
}
