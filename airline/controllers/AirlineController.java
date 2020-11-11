package com.airline.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.airline.exception.AirlineNotFoundException;
import com.airline.model.Airline;
import com.airline.service.AirlineService;
@RestController
@RequestMapping("/airline-api")
public class AirlineController {
	
	    @Autowired
	    AirlineService airlineService;
		@PostMapping("/airlines")
		Airline addAirline(@RequestBody Airline airline){
			return airlineService.addAirline(airline);
			
		}
		@DeleteMapping("/airlines/delete-one/{airlineId}")
		boolean deleteAirline(@PathVariable("airlineId")Integer airlineId) throws AirlineNotFoundException {
			return airlineService.deleteAirline(airlineId);
			
		}
		 
		@GetMapping("/airlines/get-one/{airlineId}")
		Airline getAirlineById(@PathVariable("airlineId")Integer airlineid) throws AirlineNotFoundException  {
			return airlineService.getAirlineById(airlineid);
			
		}
		@PutMapping("/airlines/update-one")
		Airline updateAirline(Airline airline) {
			return airlineService.updateAirline(airline);
			
		}
		@GetMapping("/airlines")
		List<Airline> getAllAirline(){
			return airlineService.getAllAirline();
		}
		
		   @GetMapping("/airlines/name/{name}")
		    List<Airline>getAirlineByName(@PathVariable("name")String name) throws AirlineNotFoundException{
		        return airlineService.getAirlinebyName(name);
		    }
		   


		 

	}



