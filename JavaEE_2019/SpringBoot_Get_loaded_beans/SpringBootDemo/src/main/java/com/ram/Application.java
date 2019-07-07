package com.ram;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application implements CommandLineRunner
{

	@Autowired
	private ApplicationContext appContext;

	public static void main(String[] args) throws Exception
	{
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
		String[] beanNames = appContext.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for (String beanName : beanNames)
		{
			System.out.println(beanName + " of Type :: " + appContext.getBean(beanName).getClass());
		}
	}

}