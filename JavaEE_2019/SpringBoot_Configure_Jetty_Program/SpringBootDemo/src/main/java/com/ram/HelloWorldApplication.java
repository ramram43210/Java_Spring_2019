package com.ram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.jetty.JettyServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
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

	@Bean
	public ConfigurableServletWebServerFactory webServerFactory()
	{
		JettyServletWebServerFactory factory = new JettyServletWebServerFactory();
		factory.setPort(9090);
		factory.setContextPath("/myContext");
		return factory;
	}

	@RequestMapping(value = "/hello")
	public String helloWorld()
	{
		return "Hello World";
	}

}