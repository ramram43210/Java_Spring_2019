package com.ram.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.stereotype.Component;

@Component
public class EmployeeFilter implements Filter
{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterchain)
			throws IOException, ServletException
	{
		System.out.println("Before Sending request to the controller");
		System.out.println("Remote Host = " + request.getRemoteHost());
		System.out.println("Remote Address = " + request.getRemoteAddr());
		
		filterchain.doFilter(request, response);
		
		System.out.println("Before Sending response to the client");
	}

}
