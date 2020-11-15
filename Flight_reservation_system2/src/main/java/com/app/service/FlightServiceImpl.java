package com.app.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.FlightRepository;
import com.app.pojos.City;
import com.app.pojos.Flight;

@Service
@Transactional
public class FlightServiceImpl implements IFlightService {
	
	@Autowired
	private FlightRepository repo;

	@Override
	public List<Flight> fetchFlights(City dcity, City acity,LocalDate depdate) {
		return repo.findByDepartureCityAndArrivalCityAndDateOfDeparture(dcity, acity,depdate);
	}

	@Override
	public Flight getFlightById(int fid) {
		return repo.findByFlightId(fid);
	}

}
