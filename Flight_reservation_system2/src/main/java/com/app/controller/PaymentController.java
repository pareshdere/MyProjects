package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/payment")
public class PaymentController {
	
	public PaymentController() {
		System.out.println("In Payment Controller");
	}
	
	@GetMapping("/card_dtls")
	public String showPaymentDetails() {
		System.out.println("In showPaymentDetails()");
		return "/payment/card_dtls";
	}
	@PostMapping("/card_dtls")
	public String processPaymentDetails() {
		System.out.println("in process payment ");
		return "redirect:/reservation/status";
	}
}
