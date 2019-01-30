package com.ram.employee.dao.impl;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.ram.employee.dao.EmployeeDAO;
import com.ram.employee.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO
{

	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource)
	{
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void insert(Employee employee)
	{

		String sql = "INSERT INTO EMPLOYEE "
				+ "(EMPLOYEE_ID, NAME, AGE,SALARY) VALUES (?, ?, ?,?)";

		jdbcTemplate.update(sql,
				new Object[] { employee.getEmployeeId(),
						employee.getName(), employee.getAge(),
						employee.getSalary() });

	}
}
