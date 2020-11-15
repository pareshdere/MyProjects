package com.app.controller;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.pojos.User;
import com.app.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController { 
		
		@Autowired
		private IUserService service;
		
		public UserController() {
			System.out.println("In user controller");
		}
		
		@GetMapping("/login")
	    public String showLoginPage() {
	        System.out.println("in show login page");
	        return "/user/login";
	    }

		/*
		 * @PostMapping("/login") public String processLoginPage(@RequestParam String
		 * email,
		 * 
		 * @RequestParam String password,HttpSession hs,RedirectAttributes flashMap) {
		 * System.out.println("in process login form "+email+" "+password); try { User
		 * authenticateUser = service.getAuthenticatedUser(email, password);
		 * hs.setAttribute("valid_user", authenticateUser);
		 * flashMap.addFlashAttribute("status", "User Login Successful"); return
		 * "redirect:/flight/search"; }catch(RuntimeException e) {
		 * System.out.println("err in user controller "+e); return "/user/login"; } }
		 */
		@PostMapping("/login")
		public String processLoginPage(@RequestParam String email, @RequestParam String password, Model modelMap,
				HttpSession session, RedirectAttributes flashMap) {
			System.out.println("In processLoginForm() " + email + " " + password);
			Optional<User> u = service.getAuthenticatedUser(email, password);
			if (u.isPresent()) {
				flashMap.addFlashAttribute("status", "Login Successful");
				session.setAttribute("valid_user", u.get());
				return "redirect:/flight/search";
			}
			modelMap.addAttribute("status", "Invalid Login Credentiatials");
			return "/user/login";
		}
		
		@GetMapping("/logout")
		public String userLogout(HttpSession session,Model modelMap,HttpServletRequest request,HttpServletResponse resp)
		{
			System.out.println("in logout");
			//How to maintain user details ? : before invalidating the session , store user details under curnt req scope (model)
			modelMap.addAttribute("user_dtls",session.getAttribute("valid_user"));
			//discard HttpSession
			session.invalidate(); 
			System.out.println("ctx path "+request.getContextPath());
			resp.setHeader("refresh","5;url='"+request.getContextPath()+"/'");
			return "/user/logout";
			
		}
}
