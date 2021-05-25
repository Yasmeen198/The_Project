package com.shopify.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shopify.dao.UserDao;
import com.shopify.model.UserDetail;


@Controller
public class RegisterController 
{
	@Autowired
	UserDao userDAO;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@PostMapping(value="/registerUser")
	public String registerUser(@RequestParam("username")String username,@RequestParam("password")String password,@RequestParam("customerName")String customerName,@RequestParam("emailID")String emailID,@RequestParam("mobileNumber")String mobileNumber,@RequestParam("customerAddress")String customerAddress)
	{
		System.out.println("Registered User Method");
		UserDetail user=new UserDetail();
		user.setUsername(username);
		user.setPassword(password);
		user.setCustomerName(customerName);
		user.setEnabled(true);
		user.setEmailID(emailID);
		user.setCustomerAddress(customerAddress);
		user.setMobileNumber(mobileNumber);
		user.setRole("ROLE_USER");
		
		String encodedPassword = bCryptPasswordEncoder.encode(user.getPassword());
		
		user.setPassword(encodedPassword);
		
		if(userDAO.addCustomer(user))
		{
			System.out.println("Registration Succesful");
			return "Login";
			
		}
		else
		{
			System.out.println("Error occured");
			return "Register";
		}
		
	}


}
