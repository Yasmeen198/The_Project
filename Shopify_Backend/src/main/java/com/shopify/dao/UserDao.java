package com.shopify.dao;

import java.util.List;

import com.shopify.model.UserDetail;








public interface UserDao {
	
	List<UserDetail> getAllCustomers();
	UserDetail getCustomerByID(int userId);
	boolean addCustomer(UserDetail user);
	boolean updateCustomer(UserDetail customer);
	UserDetail getCustomerByUsername(String username);
}
