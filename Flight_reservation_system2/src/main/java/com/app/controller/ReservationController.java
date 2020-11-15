package com.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.pojos.Passenger;
import com.app.pojos.Reservation;
import com.app.service.IReservationService;

@Controller
@RequestMapping("/reservation")
public class ReservationController {
	
	@Autowired
	private IReservationService service;
	
	public ReservationController() {
		System.out.println("In Reservation controller");
	}
	
	@GetMapping("/status")
	public String showReservationStatus() {
		System.out.println("In show reservation status");
		return "/reservation/status";
	}
	
	@PostMapping("/status")
	public String processReservationStatus(Reservation r,HttpSession hs,RedirectAttributes flashMap)
	{
		Passenger p = (Passenger)hs.getAttribute("passenger_data");
		r.setCurrentPassenger(p);
		Reservation r1 = service.confirmReservation(r);
		flashMap.addFlashAttribute("reservation_data", r1);
		return "redirect:/reservation/confirmReservation";
	}
	
	@GetMapping("/confirmReservation")
	public String showConfirmReservationStatus() {
		System.out.println("In show confirm reservation status");
		return "/reservation/confirmReservation";
	}
}
