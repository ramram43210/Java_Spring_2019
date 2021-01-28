package com.ram.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController
{

	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public String getEmployees(@RequestParam(value = "page") int pageValue,
			@RequestParam(value = "limit") int limitValue)
	{

		return "getEmployees method was called with page=" + pageValue + " ,and limit=" + limitValue;
	}

	@RequestMapping(value = "/employee/{employeeId}", method = RequestMethod.GET)
	public String getEmployee(@PathVariable int employeeId)
	{

		return "getEmployee method called with employeeId=" + employeeId;
	}
}
