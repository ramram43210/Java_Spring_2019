package com.example.HelloWorld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HelloWorldApplication implements CommandLineRunner
{
	@Autowired
	private ApplicationContext context;

	public static void main(String[] args)
	{
		SpringApplication.run(HelloWorldApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
		String[] beans = context.getBeanDefinitionNames();

		for (String bean : beans)
		{
			System.out.println(bean);
		}
	}
}
