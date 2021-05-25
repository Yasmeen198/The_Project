package com.shopify.dao;

import java.util.List;

import com.shopify.model.Product;





public interface ProductDao {
	List<Product> getAllProducts();
	Product getProductByID(int productID);
	boolean addProduct(Product product);
	boolean updateProduct(Product product);
	boolean deleteProduct(Product product);
}
