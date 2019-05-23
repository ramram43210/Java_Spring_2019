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
		// Write code to save in Database
		return "Employee saved successfully -- "+employee;
	}
}
