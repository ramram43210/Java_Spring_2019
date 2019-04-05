package com.ram;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.ram.configuration.AppConfig;
import com.ram.service.ProductService;

public class App
{
	public static void main(String[] args)
	{
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfig.class);

		ProductService service = (ProductService) context
				.getBean("productService");

		System.out.println("Laptop ->" + service.getByName("Laptop"));
		System.out.println("Laptop ->" + service.getByName("Laptop"));
		System.out.println("Laptop ->" + service.getByName("Laptop"));

		System.out.println("Refreshing all products");
		service.refreshAllProducts();

		System.out.println("Laptop [after refresh]->"
				+ service.getByName("Laptop"));
		System.out.println("Laptop [after refresh]->"
				+ service.getByName("Laptop"));
		System.out.println("Laptop [after refresh]->"
				+ service.getByName("Laptop"));

		((AbstractApplicationContext) context).close();
	}

}
