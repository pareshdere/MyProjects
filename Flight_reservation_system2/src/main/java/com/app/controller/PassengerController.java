package com.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.pojos.Passenger;
import com.app.service.IFlightService;
import com.app.service.IPassengerService;

@Controller
@RequestMapping("/passenger")
public class PassengerController {
	
	@Autowired
	private IFlightService flightService;
	@Autowired
	private IPassengerService service;
	
	public PassengerController() {
		System.out.println("In Passenger Controller");
	}
	
	@GetMapping("/details")
	public String showPassengerDetails(@RequestParam int fid,Passenger p) {
		System.out.println("In showPassengerDetails()");
		p.setMy_flight(flightService.getFlightById(fid));
		return "/passenger/details";
	}
	@PostMapping("/details")
	public String processPassengerDetails(Passenger p,HttpSession hs) {
		System.out.println("in process passenger ");
		hs.setAttribute("passenger_data", service.addPassenger(p));
		return "redirect:/payment/card_dtls";
	}
}
