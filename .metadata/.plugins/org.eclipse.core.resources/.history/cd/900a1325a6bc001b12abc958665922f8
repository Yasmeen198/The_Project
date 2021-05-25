package com.shopify.test;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.shopify.dao.OrderDao;
import com.shopify.model.CustomerOrder;
import com.shopify.model.Product;

public class OrderTest {
static OrderDao orderDAO;
	
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext myContext=new AnnotationConfigApplicationContext();
		myContext.scan("com.shopify");
		myContext.refresh();
		
		orderDAO=(OrderDao)myContext.getBean("orderDAO");
	}
	@Ignore
	@Test
	public void placeOrderTest()
	{
		CustomerOrder order=new CustomerOrder();
		order.setMobileNumber("67789");
		order.setProductId(12);
		order.setQuantity(23);
		order.setShippingAddress("Telangana");
		order.setUsername("yas");
		
			
		assertTrue("Problem in placing order",orderDAO.placeOrder(order));
	}
}
