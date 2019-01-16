package com.ram.core;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;

import com.ram.core.model.Company;

public class App
{

	public static void main(String[] args) throws IOException
	{
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		Marshaller marshaller = (Marshaller) context
				.getBean("jaxbMarshallerBean");

		Unmarshaller unmarshaller = (Unmarshaller) context
				.getBean("jaxbMarshallerBean");
		
		Company company = new Company();
		company.setId(201);
		company.setCompanyName("Google");
		company.setCeoName("Peter");
		company.setNumberOfEmployees(50000);

		// Perform Marshaling
		marshaller.marshal(company,
				new StreamResult(new FileWriter("company.xml")));

		System.out.println("XML Created Sucessfully");

		// Perform Unmarshaling
		Company company2 = (Company) unmarshaller
				.unmarshal(new StreamSource(new FileReader("company.xml")));
		System.out.println(company2);
		System.out.println("Converted XML to Object!");

	}
}