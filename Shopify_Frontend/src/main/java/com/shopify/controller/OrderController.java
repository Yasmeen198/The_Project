package com.shopify.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shopify.dao.OrderDao;
import com.shopify.dao.ProductDao;
import com.shopify.model.CustomerOrder;
import com.shopify.model.Product;
import com.shopify.model.UserDetail;

@Controller
public class OrderController {
	@Autowired
	private ProductDao productDAO;
	
	@Autowired
	private OrderDao orderDAO;
	
	@GetMapping("/buyProduct/{productID}")
    public String buyProduct(@PathVariable("productID") int productID , Model model)
  {
		Product product=productDAO.getProductByID(productID);
		CustomerOrder order=new CustomerOrder();
		model.addAttribute("product",product);
		model.addAttribute("order", order);
	return "Order";
}
	@PostMapping(value="/placeOrder")
	public String updateProduct(@RequestParam("productId") int productId,
			@RequestParam("username") String username, @RequestParam("mobileNumber") String mobile
			,@RequestParam("quantity")int quantity, @RequestParam("shippingAddress")String shippingAddress, Model model)
	{
		
		CustomerOrder order=new CustomerOrder();
		order.setMobileNumber(mobile);
		order.setProductId(productId);
		order.setQuantity(quantity);
		order.setShippingAddress(shippingAddress);
		order.setUsername(username);
		
		
		
		 orderDAO.placeOrder(order);
		
		
		return "Thanks";
	}
}
