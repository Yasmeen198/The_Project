package com.shopify.config;



import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;


import com.shopify.model.CustomerOrder;
import com.shopify.model.Product;
import com.shopify.model.UserDetail;



@Configuration
@EnableTransactionManagement
@ComponentScan("com.shopify") 
public class DBConfig 
{
	
		@Bean(name="dataSource")
		public DataSource getDataSource()
		{
			DriverManagerDataSource dataSource=new DriverManagerDataSource();
			dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			dataSource.setUrl("jdbc:sqlserver://YAS-2919;databaseName=shopify;");
			dataSource.setUsername("sa");
			dataSource.setPassword("niit@123");
			System.out.println("======== DataSource Bean Created===========");
			return dataSource;
		}
		
		
		@Bean
		public SessionFactory getSessionFactoryBean()
		{
			Properties hibernateProp=new Properties();
			hibernateProp.put("hibernate.show_sql", "true");
			hibernateProp.put("hibernate.hbm2ddl.auto", "update");
			hibernateProp.put("hibernate.dialect","org.hibernate.dialect.SQLServer2008Dialect");
			
			LocalSessionFactoryBuilder factoryMgr=new LocalSessionFactoryBuilder(getDataSource());
			factoryMgr.addProperties(hibernateProp);
			
	
			factoryMgr.addAnnotatedClass(UserDetail.class);
			factoryMgr.addAnnotatedClass(Product.class);
			factoryMgr.addAnnotatedClass(CustomerOrder.class);
			
			System.out.println("=== SessionFactory Object Created====");
			
			return factoryMgr.buildSessionFactory();
			
		}
		
		@Bean(name="txManager")
		public HibernateTransactionManager getHibernateTransactionManager(SessionFactory sessionFactory)
		{
			System.out.println("======== Hibernate Transaction Manager Bean Created===========");
			return new HibernateTransactionManager(sessionFactory);
		}
}