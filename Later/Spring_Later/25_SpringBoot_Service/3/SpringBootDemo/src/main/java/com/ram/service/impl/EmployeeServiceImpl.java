package com.ram.service.impl;

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

	public Employee createEmployee(Employee employee)
	{
		return employeeRepository.createEmployee(employee);
	}

	public void updateEmployee(int id, Employee employee)
	{
		employeeRepository.updateEmployee(id, employee);
	}

	public Employee getEmployee(int id)
	{
		return employeeRepository.getEmployee(id);
	}
}
