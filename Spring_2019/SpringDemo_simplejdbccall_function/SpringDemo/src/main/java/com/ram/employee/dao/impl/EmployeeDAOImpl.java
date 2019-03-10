package com.ram.employee.dao.impl;

import javax.sql.DataSource;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import com.ram.employee.dao.EmployeeDAO;

public class EmployeeDAOImpl implements EmployeeDAO
{
	private SimpleJdbcCall simpleJdbcCall;

	public void setDataSource(DataSource dataSource)
	{
		this.simpleJdbcCall = new SimpleJdbcCall(dataSource).withFunctionName("read_employee_name");
	}

	public String getEmployee(int employeeId)
	{
		SqlParameterSource in = new MapSqlParameterSource().addValue("in_employee_Id", employeeId);
		String fullName = simpleJdbcCall.executeFunction(String.class, in);
		return fullName;
	}

}
