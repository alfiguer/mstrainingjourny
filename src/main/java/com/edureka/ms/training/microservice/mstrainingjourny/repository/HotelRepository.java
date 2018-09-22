package com.edureka.ms.training.microservice.mstrainingjourny.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edureka.ms.training.microservice.mstrainingjourny.model.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer>{

}
