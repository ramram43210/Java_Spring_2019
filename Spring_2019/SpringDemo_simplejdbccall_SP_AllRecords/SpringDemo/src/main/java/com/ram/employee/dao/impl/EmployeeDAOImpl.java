package com.ram.employee.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import com.ram.employee.dao.EmployeeDAO;
import com.ram.employee.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO
{
	private SimpleJdbcCall simpleJdbcCall;

	public void setDataSource(DataSource dataSource)
	{
		this.simpleJdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("read_all_employee")
				.returningResultSet("employees", BeanPropertyRowMapper.newInstance(Employee.class));
	}

	public List<Employee> getEmployeeList()
	{
		Map m = simpleJdbcCall.execute(new HashMap<String, Object>(0));
		return (List<Employee>) m.get("employees");
	}

}
