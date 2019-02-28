package com.ram.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Component
public class EmployeeInterceptorAppConfig
		extends WebMvcConfigurationSupport
{
	@Autowired
	EmployeeInterceptor employeeInterceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry)
	{
		registry.addInterceptor(employeeInterceptor);
	}

}
