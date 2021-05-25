package com.shopify.dao;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.shopify.model.CustomerOrder;
@Repository("orderDAO")
@Transactional
public class OrderDaoImpl implements OrderDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public boolean placeOrder(CustomerOrder order) {
		try {
			 Session session = sessionFactory.getCurrentSession();
		        session.saveOrUpdate(order);
		        session.flush();
		        return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		
	}

	

}
