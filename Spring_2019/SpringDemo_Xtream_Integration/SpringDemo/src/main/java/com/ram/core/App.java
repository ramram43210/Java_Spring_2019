package com.ram.core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

		convertObjectToXML(context);
		convertXMLToObject(context);
	}

	private static void convertObjectToXML(ApplicationContext context)
			throws IOException
	{
		Marshaller marshaller = (Marshaller) context
				.getBean("xstreamMarshallerBean");

		// Perform Marshaling
		Company company = new Company();
		company.setId(201);
		company.setCompanyName("Google");
		company.setCeoName("Peter");
		company.setNumberOfEmployees(50000);

		marshaller.marshal(company,
				new StreamResult(new FileWriter("company.xml")));

		System.out.println("XML Created Sucessfully");
	}
	
	private static void convertXMLToObject(ApplicationContext context)
			throws FileNotFoundException, IOException
	{
		Unmarshaller unmarshaller = (Unmarshaller) context
				.getBean("xstreamMarshallerBean");		
		
		FileInputStream is = null;
		try
		{
			is = new FileInputStream("company.xml");
			Object object = unmarshaller.unmarshal(new StreamSource(is));
			System.out.println(object);
			System.out.println("Converted XML to Object!");
		}
		finally
		{
			if (is != null)
			{
				is.close();
			}
		}
	}

	
}