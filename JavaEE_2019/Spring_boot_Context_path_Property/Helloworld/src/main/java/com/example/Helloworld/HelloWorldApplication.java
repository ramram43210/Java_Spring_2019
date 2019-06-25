package com.example.Helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorldApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(HelloWorldApplication.class, args);
	}
	
	@RequestMapping(value = "/hello")
	public String helloWorld()
	{
		return "Hello World, Peter";
	}
}
