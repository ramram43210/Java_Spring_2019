package com.ram.core;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ram.core.model.Customer;

public class App
{
	private static final String XML_FILE_NAME = "customer.xml";

	public static void main(String[] args) throws IOException	
	{
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		XMLConverter converter = (XMLConverter) appContext
				.getBean("XMLConverter");

		Customer customer = new Customer();
		customer.setName("Peter");
		customer.setAge(52);
		customer.setAddress("A505,North Street,Bangalore");

		// from object to XML file
		converter.convertFromObjectToXML(customer, XML_FILE_NAME);
		System.out.println("Converted Object to XML!");

		// from XML to object
		Customer customer2 = (Customer) converter
				.convertFromXMLToObject(XML_FILE_NAME);
		System.out.println(customer2);
		System.out.println("Converted XML to Object!");

	}
}