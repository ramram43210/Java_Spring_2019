package com.ram.employee.dao.impl;

import javax.sql.DataSource;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import com.ram.employee.dao.EmployeeDAO;
import com.ram.employee.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO
{
	private SimpleJdbcInsert simpleJdbcInsert;

	public void setDataSource(DataSource dataSource)
	{
		this.simpleJdbcInsert = new SimpleJdbcInsert(dataSource)
				.withTableName("EMPLOYEE")
				.usingGeneratedKeyColumns("EMPLOYEE_ID");
	}

	public void insert(Employee employee)
	{

		SqlParameterSource parameters = new MapSqlParameterSource()
				.addValue("NAME", employee.getName())
				.addValue("AGE", employee.getAge())
				.addValue("SALARY", employee.getSalary());

		Number newEmployeeId = simpleJdbcInsert
				.executeAndReturnKey(parameters);
		System.out.println("newEmployeeId = " + newEmployeeId);

	}
}
