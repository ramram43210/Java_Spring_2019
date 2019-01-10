package com.ram.core;

import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ram.core.config.AppConfig;
import com.ram.core.model.Customer;

public class App
{
	private static final String XML_FILE_NAME = "customer.xml";

	public static void main(String[] args) throws IOException
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfig.class);
		XMLConverter converter = (XMLConverter) context
				.getBean(XMLConverter.class);

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