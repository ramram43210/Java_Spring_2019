package com.example.HelloWorld;

import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.stereotype.Component;

@Component
public class CustomContainer implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory>
{

	public void customize(ConfigurableServletWebServerFactory factory)
	{
		factory.setPort(9090);
		factory.setContextPath("/myContext");
	}
}
