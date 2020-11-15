package com.app.service;

import java.time.LocalDate;
import java.util.List;

import com.app.pojos.City;
import com.app.pojos.Flight;

public interface IFlightService {
	
	List<Flight> fetchFlights(City dcity,City acity,LocalDate depdate);
	
	Flight getFlightById(int fid);
}
