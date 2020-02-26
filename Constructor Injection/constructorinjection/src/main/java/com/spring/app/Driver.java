package com.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sun.awt.AppContext;

public class Driver {
	
public static void main(String[] args)
{
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	Customer customer = (Customer)context.getBean("custObj");
	System.out.println(customer);
	
}

}
