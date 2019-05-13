package com.ram;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootStandAloneApplication implements CommandLineRunner
{

	public static void main(String[] args)
	{
		SpringApplication.run(SpringBootStandAloneApplication.class, args);
	}

	public void run(String... arg0) throws Exception
	{
		System.out.println("Hello world, Peter");
	}
}