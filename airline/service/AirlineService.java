package com.airline.service;

import java.util.List;

import com.airline.exception.AirlineNotFoundException;
import com.airline.model.Airline;

public interface AirlineService {
	Airline addAirline(Airline airline);
	boolean deleteAirline(Integer airlineId) throws AirlineNotFoundException;
	Airline getAirlineById(Integer airlineid)throws AirlineNotFoundException;
	Airline updateAirline(Airline airline);
	
	List<Airline> getAllAirline();
	List<Airline> getAirlinebyName(String name)throws AirlineNotFoundException;
	
   
   


}
