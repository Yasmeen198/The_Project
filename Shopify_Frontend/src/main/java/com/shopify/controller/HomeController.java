package com.shopify.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@GetMapping("/login")
	public String loginPage(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout, Model model) {

		if (error != null) {
			model.addAttribute("error", "Invalid username and password");
		}

		if (logout != null) {
			model.addAttribute("msg", "You have been logged out successfully");
		}

		return "Login";
	}
	
	@GetMapping("/perform_logout")
	public String logoutPage(HttpServletRequest request, HttpServletResponse response) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null) {
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}
		return "index";
	}
	
		@GetMapping("/register")
		public String showRegisterPage(Model m)
		{
			System.out.println("== I am in My Controller - Register Page");
			m.addAttribute("pagename","Sign Up");
			return "Register";
		}
		
		@GetMapping(value={"/","/index"})
		public String showIndexPage(Model m)
		{
			System.out.println("== I am in My Controller - index Page");
			m.addAttribute("pagename","Home");
			return "index";
		}
		
		@GetMapping("/adminpage")
		public String showAdminPage(Model m)
		{
			System.out.println("== I am in My Controller - Admin Page");
			m.addAttribute("pagename","Admin");
			return "AdminHome";
		}
		
		@GetMapping("/userpage")
		public String showindexPage(Model m)
		{
			System.out.println("== I am in My Controller - User Page");
			m.addAttribute("pagename","USer");
			return "UserHome";
		}
		
		
		@GetMapping("/aboutUs")
		public String showAboutUs(Model m)
		{
			System.out.println("== I am in My Controller - aboutus Page");
			m.addAttribute("pagename","About US");
			return "AboutUs";
		}
		
		@GetMapping("/contact")
		public String showContactUs(Model m)
		{
			System.out.println("== I am in My Controller - contact Page");
			m.addAttribute("pagename","Contact US");
			return "ContactUs";
		}
		
		
	}

