package com.example.spring.repository;

import com.example.spring.model.UserCar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserCarRepository extends JpaRepository<UserCar, Long> {


}
