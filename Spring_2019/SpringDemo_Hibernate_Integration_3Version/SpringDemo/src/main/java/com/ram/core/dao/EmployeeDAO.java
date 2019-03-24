package com.ram.core.dao;

import com.ram.core.model.Employee;

public interface EmployeeDAO
{
	public void save(Employee employee);

	public Employee get(int employeeId);
}
