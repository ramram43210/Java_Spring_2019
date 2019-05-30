package com.ram.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ram.model.Employee;
import com.ram.repository.EmployeeRepository;
import com.ram.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService
{

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getEmployees()
	{
		return employeeRepository.getEmployees();
	}
}
