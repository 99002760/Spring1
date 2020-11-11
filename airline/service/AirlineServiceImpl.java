package com.airline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airline.dao.AirlineRepository;
import com.airline.exception.AirlineNotFoundException;
import com.airline.model.Airline;
@Service
public class AirlineServiceImpl implements AirlineService {
	@Autowired
	AirlineRepository airlineRepository;


	@Override
	public Airline addAirline(Airline airline) {
		Airline newairline =airlineRepository.save(airline);
		
		return newairline;
	}

	@Override
	public boolean deleteAirline(Integer airlineId) throws AirlineNotFoundException {
		airlineRepository.deleteById(airlineId);
		return true;
	}

	@Override
	public Airline getAirlineById(Integer airlineId) throws  AirlineNotFoundException {
		 Airline airline=airlineRepository.findById(airlineId)
		.orElseThrow(()->new  AirlineNotFoundException("Id not available"));
		return null;
		
	}      

	@Override
	public  Airline updateAirline( Airline airline) {
		
		return airlineRepository.save(airline);
	}

	@Override
	public List< Airline> getAllAirline() {
		
		return airlineRepository.findAll();
	}

	@Override
	public List<Airline> getAirlinebyName(String name) throws AirlineNotFoundException {
		// TODO Auto-generated method stub
		return airlineRepository.findByName(name);
	}

	
	

}
