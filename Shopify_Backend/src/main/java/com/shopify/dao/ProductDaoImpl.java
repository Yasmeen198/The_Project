package com.shopify.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.shopify.model.Product;




@Repository("productDAO")
@Transactional
public class ProductDaoImpl implements ProductDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Product> getAllProducts() {
		List<Product> allProducts = new ArrayList<Product>();
		try
		{
			Session session = sessionFactory.getCurrentSession();
			allProducts = session.createQuery("from Product").list();
			return allProducts;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
	}

	@Override
	public Product getProductByID(int productID) {
		Product product;
		try
		{
			Session session = sessionFactory.getCurrentSession();
			product = session.get(Product.class, productID);
			return product;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean addProduct(Product product) {
		try
		{
			Session session = sessionFactory.getCurrentSession();
			session.save(product);
			session.flush();
			return true;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateProduct(Product product) {
		
		try
		{
			Session session = sessionFactory.getCurrentSession();
			session.saveOrUpdate(product);
			session.flush();
			return true;
}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
}
	}

	@Override
	public boolean deleteProduct(Product product) {
	
		try
		{
			Session session = sessionFactory.getCurrentSession();
			session.delete(product);
			session.flush();
			return true;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
			
		}
	}

}

