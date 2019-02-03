package com.ram.employee.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ram.employee.model.Employee;

public class EmployeeRowMapper implements RowMapper<Employee>
{

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		Employee employee = new Employee();
		employee.setEmployeeId(rs.getInt("EMPLOYEE_ID"));
		employee.setName(rs.getString("NAME"));
		employee.setAge(rs.getInt("AGE"));
		employee.setSalary(rs.getInt("SALARY"));
		return employee;
	}

}
