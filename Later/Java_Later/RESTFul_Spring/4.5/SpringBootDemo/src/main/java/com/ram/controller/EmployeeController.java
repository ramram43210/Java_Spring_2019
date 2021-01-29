package com.ram.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController
{

	@GetMapping
	public String getEmployee()
	{

		return "Get Employee was called.";
	}

	@PostMapping
	public String createEmployee()
	{

		return "Create Employee was called.";
	}
	
	@PutMapping
	public String updateEmployee()
	{

		return "Update Employee was called.";
	}
	
	@DeleteMapping
	public String deleteEmployee()
	{

		return "Delete Employee was called.";
	}
}
