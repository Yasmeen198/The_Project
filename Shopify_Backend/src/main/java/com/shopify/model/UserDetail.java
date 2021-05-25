package com.shopify.model;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table
public class UserDetail implements Serializable{

	private static final long serialVersionUID = 4496732626083742004L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	
	private String username;
	private String password;
	private boolean enabled;
	private String customerName;
	private String customerAddress;
	private String mobileNumber;
	private String emailID;
	private String role;
	

	
	
	
	public UserDetail()
	{
		
	}

	
	public boolean isEnabled() {
		return enabled;
	}


	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	public String getCustomerAddress() {
		return customerAddress;
	}


	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}


	public String getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public String getEmailID() {
		return emailID;
	}


	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password =password;
	}
	
	
	
}

