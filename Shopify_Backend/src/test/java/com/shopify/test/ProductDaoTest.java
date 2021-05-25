package com.shopify.test;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.shopify.dao.ProductDao;
import com.shopify.model.Product;

public class ProductDaoTest 
{
static ProductDao productDAO;
	
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext myContext=new AnnotationConfigApplicationContext();
		myContext.scan("com.shopify");
		myContext.refresh();
		
		productDAO=(ProductDao)myContext.getBean("productDAO");
	}
	@Ignore
	@Test
	public void addProductTest()
	{
		Product product=new Product();
		product.setProductID(123);
		product.setProductName("Designer Cushions");
		product.setDescription("Comfortable and soft");
		product.setQuantity(24);
		product.setPrice(500);
			
		assertTrue("Problem in inserting Product",productDAO.addProduct(product));
	}
	@Ignore
	@Test
	public void updateProductTest()
	{
		Product product=(Product)productDAO.getProductByID(1001);
		product.setProductName("Mattress");
		
		//assertNotNull("Problem in Null Category",category);
		
		System.out.println("Product ID:"+product.getProductID());
		System.out.println("Product Name:"+product.getProductName());
		
		assertTrue("Problem in updating Product",productDAO.updateProduct(product));
	}
	@Ignore
	@Test
	public void retrieveProductsTest()
	{
		List<Product> productList=(List<Product>)productDAO.getAllProducts();
		
		assertTrue("Problem in Retrieving the Product List",productList.size()>0);
		
		for(Product product:productList)
		{
			System.out.println(product);
		}
	}
	@Ignore
	@Test
	public void deleteProductTest()
	{
		Product category=(Product)productDAO.getProductByID(123);
		
		
		assertTrue("Problem in updating Product",productDAO.deleteProduct(category));
	}

}
