package com.app.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.City;
import com.app.pojos.Flight;

public interface FlightRepository extends JpaRepository<Flight, Integer>{
	
	List<Flight> findByDepartureCityAndArrivalCityAndDateOfDeparture(City dcity,City acity,LocalDate depdate);
	
	Flight findByFlightId(int fid);
}
