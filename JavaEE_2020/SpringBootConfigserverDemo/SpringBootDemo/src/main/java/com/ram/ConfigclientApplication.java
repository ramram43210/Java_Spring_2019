package com.ram;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RefreshScope
@RestController
public class ConfigclientApplication
{
	@Value("${welcome.message}")
	String welcomeText;

	public static void main(String[] args)
	{
		SpringApplication.run(ConfigclientApplication.class, args);
	}

	@RequestMapping(value = "/")
	public String hello()
	{
		return welcomeText;
	}

}
