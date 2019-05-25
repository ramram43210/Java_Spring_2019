package com.example.HelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorldApplication implements WebServerFactoryCustomizer<ConfigurableWebServerFactory>
{

	public static void main(String[] args)
	{
		SpringApplication.run(HelloWorldApplication.class, args);
	}

	@RequestMapping(value = "/")
	public String hello()
	{
		return "Hello World";
	}

	@Override
	public void customize(ConfigurableWebServerFactory factory)
	{
		factory.setPort(9090);
	}

}
