package com.example.HelloWorld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorldApplication
{
	private static final Logger logger = LoggerFactory.getLogger(HelloWorldApplication.class);

	public static void main(String[] args)
	{
		SpringApplication.run(HelloWorldApplication.class, args);
		logger.debug("This is a debug message");
		logger.info("This is a info message");
		logger.warn("This is a warn message");
		logger.error("This is a error message");
	}

	@RequestMapping(value = "/hello")
	public String helloWorld()
	{
		logger.info("Inside helloWorld method---");
		return "Hello World , Peter ";
	}

}
