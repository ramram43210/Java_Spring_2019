package com.ram.controller;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EmployeeServiceController
{

	private static final Logger LOG = Logger.getLogger(EmployeeServiceController.class.getName());

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(value = "/template/employees", method = RequestMethod.GET)
	public String getEmployees()
	{
		LOG.log(Level.INFO, "Inside getEmployees method of SpringBootRestTemplateDemo Application");

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		
		return restTemplate
				.exchange("http://localhost:8080/employees", HttpMethod.GET, entity, String.class)
				.getBody();
	}

}
