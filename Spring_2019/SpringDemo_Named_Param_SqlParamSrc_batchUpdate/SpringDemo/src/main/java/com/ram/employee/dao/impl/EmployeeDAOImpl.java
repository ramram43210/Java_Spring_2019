package com.ram.employee.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.ram.employee.dao.EmployeeDAO;
import com.ram.employee.model.Employee;

public class EmployeeDAOImpl
		extends NamedParameterJdbcDaoSupport implements EmployeeDAO
{
	public void batchInsert(List<Employee> employeeList)
	{

		String sql = "INSERT INTO EMPLOYEE "
				+ "(EMPLOYEE_ID, NAME, AGE,SALARY) VALUES (:employeeId, :name, :age,:salary)";

		List<SqlParameterSource> parameters = new ArrayList<SqlParameterSource>();
		for (Employee employee : employeeList)
		{
			parameters.add(
					new BeanPropertySqlParameterSource(employee));
		}

		SqlParameterSource[] sqlParameterSourceArray = parameters
				.toArray(new SqlParameterSource[0]);

		getNamedParameterJdbcTemplate().batchUpdate(sql,
				sqlParameterSourceArray);
	}

}
