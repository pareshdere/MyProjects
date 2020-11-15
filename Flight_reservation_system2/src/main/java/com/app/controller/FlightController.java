package com.app.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.pojos.City;
import com.app.pojos.Flight;
import com.app.service.FlightServiceImpl;

@Controller
@RequestMapping("/flight")
public class FlightController {
	
	@Autowired
	private FlightServiceImpl service;
	
	public FlightController() {
		System.out.println("In Flight controller");
	}
	
	@GetMapping("/search")
	public String showSearchPage()
	{
		System.out.println("In showSearchPage()");
		return "/flight/search";
	}
	
	@PostMapping("/search")
	public String findFlights(@RequestParam City departureCity,@RequestParam City arrivalCity,
			@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate dateOfDeparture,
			ModelMap modelMap) {
		
		List<Flight> flights = service.fetchFlights(departureCity, arrivalCity,dateOfDeparture);
		if (flights.isEmpty()) {
			modelMap.addAttribute("flightList", "No flights available for enterred destination");
			return "/flight/search";
		}
		modelMap.addAttribute("flightList", flights);
		return "/flight/display";
		
	}
	
}
