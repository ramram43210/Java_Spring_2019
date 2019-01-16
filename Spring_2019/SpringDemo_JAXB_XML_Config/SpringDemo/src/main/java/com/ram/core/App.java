package com.ram.core;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ram.core.model.Company;

public class App
{
	private static final String XML_FILE_NAME = "company.xml";

	public static void main(String[] args) throws IOException
	{
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		XMLConverter converter = (XMLConverter) context
				.getBean(XMLConverter.class);

		// Perform Marshaling
		Company company = new Company();
		company.setId(201);
		company.setCompanyName("Google");
		company.setCeoName("Peter");
		company.setNumberOfEmployees(50000);

		// from object to XML file
		converter.convertFromObjectToXML(company, XML_FILE_NAME);
		System.out.println("Converted Object to XML!");

		// from XML to object
		Company company2 = (Company) converter
				.convertFromXMLToObject(XML_FILE_NAME);
		System.out.println(company2);
		System.out.println("Converted XML to Object!");
		
	}
}