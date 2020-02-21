package com.ram.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ram.model.Employee;

@RestController
public class EmployeeController
{
	@RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
	public String saveEmployeeInformation(@RequestBody Employee employee)
	{
		System.out.println(employee);
		
		// Write code to save in the Database
		
		return "Employee saved successfully -- "+employee;
	}
}
