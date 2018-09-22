package com.edureka.ms.training.microservice.mstrainingjourny.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.edureka.ms.training.microservice.mstrainingjourny.model.Hotel;
import com.edureka.ms.training.microservice.mstrainingjourny.repository.HotelRepository;

@RestController
public class HotelController {
	
	@Autowired
	private HotelRepository hotelRepository;

	@GetMapping("/hotels")
	public List<Hotel> retrieveHotels() {
		return hotelRepository.findAll();
	}
	
	@PostMapping("/hotels")
	public ResponseEntity<Hotel> createHotel(@Valid @RequestBody Hotel hotel) {
		Hotel savedHotel = hotelRepository.save(hotel);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedHotel.getId())
				.toUri();
		return ResponseEntity.created(location).build();
	}
}
