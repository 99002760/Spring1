package com.airline.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="airline")
@TypeAlias("Airline")
public class Airline {
	@Id
	Integer airlineId;
	String name;
	public Airline() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Airline(Integer airlineId, String name) {
		super();
		this.airlineId = airlineId;
		this.name = name;
	}
	public Integer getAirlineId() {
		return airlineId;
	}
	public void setAirlineId(Integer airlineId) {
		this.airlineId = airlineId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Airline [airlineId=" + airlineId + ", name=" + name + "]";
	}
	
	
  
}
