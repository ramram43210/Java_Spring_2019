package com.ram.service;

import java.util.List;

import com.ram.model.Employee;

public interface EmployeeService
{
	public abstract Employee createEmployee(Employee employee);
	public abstract List<Employee> getEmployees();
}
