package com.shopify.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shopify.dao.ProductDao;
import com.shopify.model.Product;

@Controller
public class ProductController {

	
	@Autowired
	ProductDao productDAO;

	
	@GetMapping(value="/showProduct")
	public String showProduct(Model model)
	{
		List<Product> productList=productDAO.getAllProducts();
		model.addAttribute("productList", productList);
		return "Product";
		
	}

	@PostMapping(value = "/insertProduct")
	public String insertProduct(
			@RequestParam("productName") String productName, @RequestParam("description") String productDesc
			,@RequestParam("quantity")int stock, @RequestParam("price")int price, Model model) {
		Product product = new Product();
		product.setProductName(productName);
		product.setDescription(productDesc);
		product.setPrice(price);
		product.setQuantity(stock);
	
		productDAO.addProduct(product);

		List<Product> productList = productDAO.getAllProducts();
		model.addAttribute("productList", productList);
		return "Product";

	}
	

	@PostMapping(value="/updateProduct")
	public String updateProduct(@RequestParam("productID") int productId,
			@RequestParam("productName") String productName, @RequestParam("description") String productDesc
			,@RequestParam("quantity")int stock, @RequestParam("price")int price, Model model)
	{
		Product product=productDAO.getProductByID(productId);
		product.setProductName(productName);
		product.setDescription(productDesc);
		product.setPrice(price);
		product.setQuantity(stock);
		
		
		 productDAO.updateProduct(product);
		List<Product> productList = productDAO.getAllProducts();
		model.addAttribute("productList", productList);
		
		return "Product";
	}
	
	@GetMapping(value="/editProduct/{productID}")
	public String editProduct(@PathVariable("productID")int productID,Model model)
	{
		Product product=productDAO.getProductByID(productID);
		model.addAttribute("product", product);
		return "ProductUpdate";
	}
	
	@GetMapping("/deleteProduct/{productID}")
	public String deleteProduct(@PathVariable("productID") int productID , Model model)
	{
		System.out.println("I am in Delete page");
		Product product= productDAO.getProductByID(productID);
		
		productDAO.deleteProduct(product);
		List<Product> productList = productDAO.getAllProducts();
		model.addAttribute("productList", productList);
		
		return "Product";
	}
	
}