package com.shopify.test;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.shopify.dao.UserDao;
import com.shopify.model.UserDetail;

public class UserDaoTest 
{
	static UserDao userDAO;
	
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext myContext=new AnnotationConfigApplicationContext();
		myContext.scan("com.shopify");
		myContext.refresh();
		
		userDAO=(UserDao)myContext.getBean("userDAO");
	}
	
	@Test
	public void registerUserTest()
	{
		UserDetail user=new UserDetail();
		user.setUsername("Yas");
		user.setPassword("234");
		user.setCustomerName("Yasmeen");
		user.setEnabled(true);
		user.setEmailID("yas@gmail.com");
		user.setCustomerAddress("Telangana");
		user.setMobileNumber("89898986");
		user.setRole("ROLE_ADMIN");
		
		assertTrue("Problem in Inserting UserDetail :",userDAO.addCustomer(user));
	}
	@Ignore
	@Test
	public void getAllCustomers()
	{
		List<UserDetail> customers=(List<UserDetail>)userDAO.getAllCustomers();
		
		assertTrue("Problem in Retrieving the Customer List",customers.size()>0);
		
		for(UserDetail user:customers)
		{
			System.out.println(user);
		}
	}
	@Ignore
	@Test
	public void updateCustomerTest()
	{
		UserDetail customer=(UserDetail)userDAO.getCustomerByID(234);
		customer.setRole("ROLE_USER");
		customer.setEnabled(false);
		

		
		assertTrue("Problem in updating Product",userDAO.updateCustomer(customer));
	}

}