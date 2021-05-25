package com.shopify.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shopify.model.CustomerOrder;
import com.shopify.model.UserDetail;




@Repository("userDAO")
@Transactional
public class UserDaoImpl implements UserDao{

	
	@Autowired
	private SessionFactory sessionFactory;

	

	
	@Override
	public List<UserDetail> getAllCustomers() {
		List<UserDetail> allCustomers = new ArrayList<UserDetail>();
		try
		{
			Session session = sessionFactory.getCurrentSession();
			allCustomers = session.createQuery("from UserDetail").list();
			return allCustomers;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
	}

	@Override
	public UserDetail getCustomerByID(int userId) {
		UserDetail user;
		try
		{
			Session session = sessionFactory.getCurrentSession();
			user = session.get(UserDetail.class, userId);
			return user;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean addCustomer(UserDetail user) {
		try
		{
		sessionFactory.getCurrentSession().save(user);
		Session session = sessionFactory.getCurrentSession();
		
		CustomerOrder order=new CustomerOrder();
		order.setShippingAddress(user.getCustomerAddress());
		
		session.save(order);
		session.save(user);
		
			return true;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateCustomer(UserDetail customer) {
		try
		{
			Session session = sessionFactory.getCurrentSession();
			session.saveOrUpdate(customer);
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
	public UserDetail getCustomerByUsername(String username) {
		try {
		Session session = sessionFactory.getCurrentSession();
        UserDetail user = (UserDetail) session.createQuery("from Customer where username = ?").setParameter(0,username);
        return user;}
		catch(Exception e)
		{
		return null;
	}
}
}