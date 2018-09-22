package com.edureka.ms.training.microservice.mstrainingjourny.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Hotel {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String name;
	
	private String description;
	
	private String city;
	
	private String rating;
}
