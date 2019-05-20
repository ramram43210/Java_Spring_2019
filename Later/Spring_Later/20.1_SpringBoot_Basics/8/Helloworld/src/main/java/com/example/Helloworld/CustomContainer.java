package com.example.Helloworld;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.stereotype.Component;

@Component
public class CustomContainer implements WebServerFactoryCustomizer<TomcatServletWebServerFactory>
{

	public void customize(TomcatServletWebServerFactory factory)
	{
		factory.setPort(9090);
		factory.setContextPath("/myContext");
	}
}
