package com.ram.employee.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.ram.employee.dao.EmployeeDAO;
import com.ram.employee.model.Employee;

public class EmployeeDAOImpl
		extends JdbcDaoSupport implements EmployeeDAO
{
	public void insertEmployeeRecords(List<Employee> employeeList)
	{

		String sql = "INSERT INTO EMPLOYEE "
				+ "(EMPLOYEE_ID, NAME, AGE,SALARY) VALUES (?, ?, ?,?)";
		List<Object[]> batchArgsList = new ArrayList<Object[]>();

		for (Employee employee : employeeList)
		{
			Object[] objectArray = { employee.getEmployeeId(),
					employee.getName(), employee.getAge(),
					employee.getSalary() };
			batchArgsList.add(objectArray);
		}

		getJdbcTemplate().batchUpdate(sql, batchArgsList);

	}

}
