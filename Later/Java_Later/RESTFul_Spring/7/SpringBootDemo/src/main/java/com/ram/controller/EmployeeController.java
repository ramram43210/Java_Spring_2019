package com.ram.controller;

import java.util.Random;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ram.model.Employee;

@RestController
public class EmployeeController
{

	@RequestMapping(value = "/employee",
			method = RequestMethod.POST,
			produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE },
			consumes = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public Employee createEmployee(@RequestBody Employee employee)
	{
		System.out.println("employee = "+employee);
		employee.setId(new Random().nextInt());
		return employee;
	}

}
