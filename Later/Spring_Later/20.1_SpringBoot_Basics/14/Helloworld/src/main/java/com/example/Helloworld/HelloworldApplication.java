package com.example.Helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloworldApplication implements CommandLineRunner
{
	@Autowired
	private ApplicationContext context;

	public static void main(String[] args)
	{
		SpringApplication.run(HelloworldApplication.class, args);
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
