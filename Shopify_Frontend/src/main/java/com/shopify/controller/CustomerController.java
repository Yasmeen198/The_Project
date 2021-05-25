package com.shopify.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shopify.dao.UserDao;
import com.shopify.model.UserDetail;

@Controller
public class CustomerController {

	@Autowired
	private UserDao userDAO;
	
	@GetMapping(value="/showCustomers")
	public String showCustomers(Model model)
	{
		List<UserDetail> allCustomers=userDAO.getAllCustomers();
		model.addAttribute("allCustomers", allCustomers);
		return "Customer";
		
	}
	
	@GetMapping(value="/updateCustomer/{userId}")
	public String editProduct(@PathVariable("userId")int userId,Model model)
	{
		UserDetail customer=userDAO.getCustomerByID(userId);
		model.addAttribute("customer",customer);
		return "CustomerUpdate";
	}
	
	
	
	
	@PostMapping(value="/updateCustomer")
	public String updateProduct(@RequestParam("userId") int userId,@RequestParam("role") String role,
			@RequestParam("enabled") boolean enabled, Model model)
	{
		UserDetail customer=userDAO.getCustomerByID(userId);
		customer.setEnabled(enabled);
		customer.setRole(role);
		userDAO.updateCustomer(customer);
		
		
		List<UserDetail> allCustomers=userDAO.getAllCustomers();
		model.addAttribute("allCustomers", allCustomers);
		return "Customer";
	}
}
