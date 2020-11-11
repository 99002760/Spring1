package com.airline.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.airline.model. Airline;

@Repository
public interface  AirlineRepository extends MongoRepository< Airline,Integer>{
	
	List< Airline> findByName(String name);
	
 
}


