package com.ram;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.ram.configuration.AppConfig;
import com.ram.model.Product;
import com.ram.service.ProductService;

public class App
{
	public static void main(String[] args)
	{

		AbstractApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfig.class);

		ProductService service = (ProductService) context
				.getBean("productService");

		System.out.println("LED TV ->" + service.getByName("LED TV"));
		System.out.println("LED TV ->" + service.getByName("LED TV"));
		System.out.println("LED TV ->" + service.getByName("LED TV"));

		System.out.println("Phone ->" + service.getByName("Phone"));
		System.out.println("Phone ->" + service.getByName("Phone"));
		System.out.println("Phone ->" + service.getByName("Phone"));

		Product product = new Product("LED TV", 550);
		service.updateProduct(product);

		System.out.println("LED TV ->" + service.getByName("LED TV"));
		System.out.println("LED TV ->" + service.getByName("LED TV"));
		System.out.println("LED TV ->" + service.getByName("LED TV"));

		System.out.println("Refreshing all products");

		service.refreshAllProducts();
		System.out.println("LED TV [after refresh]->"
				+ service.getByName("LED TV"));
		System.out.println("LED TV [after refresh]->"
				+ service.getByName("LED TV"));
		System.out.println("LED TV [after refresh]->"
				+ service.getByName("LED TV"));

		((AbstractApplicationContext) context).close();
	}

}
