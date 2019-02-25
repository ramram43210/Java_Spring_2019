package com.ram.employee.dao.impl;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import com.ram.employee.dao.EmployeeDAO;
import com.ram.employee.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO
{
	private SimpleJdbcInsert simpleJdbcInsert;

	public void setDataSource(DataSource dataSource)
	{
		this.simpleJdbcInsert = new SimpleJdbcInsert(dataSource)
				.withTableName("EMPLOYEE").usingColumns("NAME", "AGE")
				.usingGeneratedKeyColumns("EMPLOYEE_ID");
	}

	public void insert(Employee employee)
	{
		Map<String, Object> parameters = new HashMap<String, Object>(
				3);
		parameters.put("NAME", employee.getName());
		parameters.put("AGE", employee.getAge());
		Number newEmployeeId = simpleJdbcInsert.executeAndReturnKey(parameters);
		System.out.println("newEmployeeId = "+newEmployeeId);
	}
}
