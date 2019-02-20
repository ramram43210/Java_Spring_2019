package com.ram.employee.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;

import com.ram.employee.dao.EmployeeDAO;
import com.ram.employee.model.Employee;

public class EmployeeDAOImpl
		extends NamedParameterJdbcDaoSupport implements EmployeeDAO
{
	public void batchInsert(List<Employee> employeeList)
	{

		String sql = "INSERT INTO EMPLOYEE "
				+ "(EMPLOYEE_ID, NAME, AGE,SALARY) VALUES (:employeeId, :name, :age,:salary)";

		SqlParameterSource[] parameters = SqlParameterSourceUtils
				.createBatch(employeeList.toArray());

		getNamedParameterJdbcTemplate().batchUpdate(sql, parameters);

	}
}
