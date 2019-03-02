package com.ram.employee.dao.impl;

import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import com.ram.employee.dao.EmployeeDAO;
import com.ram.employee.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO
{
	private SimpleJdbcCall simpleJdbcCall;

	public void setDataSource(DataSource dataSource)
	{
		this.simpleJdbcCall = new SimpleJdbcCall(dataSource)
				.withProcedureName("read_employee");
	}

	public Employee getEmployee(int employeeId)
	{
		SqlParameterSource in = new MapSqlParameterSource()
				.addValue("in_employeeId", employeeId);
		Map<String, Object> out = simpleJdbcCall.execute(in);
		Employee employee = new Employee();
		employee.setEmployeeId(employeeId);
		employee.setName((String)out.get("out_name"));
		employee.setAge((Integer) out.get("out_age"));
		employee.setSalary((Integer) out.get("out_salary"));
		return employee;
	}

}
