package com.example.HelloWorld;

import org.springframework.beans.factory.annotation.Value;
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

	@Value("${employee.name:Peter}")
	private String employeeName;

	public static void main(String[] args)
	{

		SpringApplication.run(HelloWorldApplication.class, args);
	}

	@RequestMapping(value = "/")
	public String hello()
	{
		return "Hello World , " + employeeName;
	}

	@Override
	public void customize(ConfigurableWebServerFactory factory)
	{
		factory.setPort(8086);
	}

}
