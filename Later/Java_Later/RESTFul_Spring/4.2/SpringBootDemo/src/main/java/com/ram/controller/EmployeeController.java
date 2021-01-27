package com.ram.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController
{
	@RequestMapping(value = "/employee/{employeeId}", method = RequestMethod.GET)
	public String getEmployee(@PathVariable int employeeId)
	{

		return "getEmployee method called with employeeId=" + employeeId;
	}
}
