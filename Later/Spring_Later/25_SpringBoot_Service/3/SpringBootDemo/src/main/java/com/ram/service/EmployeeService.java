package com.ram.service;

import com.ram.model.Employee;

public interface EmployeeService
{
	public abstract Employee createEmployee(Employee employee);

	public abstract void updateEmployee(int id, Employee employee);
	
	public abstract Employee getEmployee(int id);
}
