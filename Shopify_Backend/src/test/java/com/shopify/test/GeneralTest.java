package com.shopify.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GeneralTest 
{
	public static void main(String arg[])
	{
		
		AnnotationConfigApplicationContext myContext=new AnnotationConfigApplicationContext();
		
		myContext.scan("com.shopify");
		
		myContext.refresh();
		
		
	}
}
