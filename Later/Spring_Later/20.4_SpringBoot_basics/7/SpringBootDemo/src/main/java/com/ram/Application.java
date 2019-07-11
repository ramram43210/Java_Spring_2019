package com.ram;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application
{
	
	public static void main(String[] args)
	{
		SpringApplication springApp = new SpringApplication(Application.class);
        springApp.setBannerMode(Banner.Mode.OFF);
        springApp.run(args);
	}

}
