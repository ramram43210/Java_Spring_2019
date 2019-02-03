package com.ram.employee.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.ram.employee.dao.EmployeeDAO;
import com.ram.employee.model.Employee;

public class EmployeeDAOImpl
		extends JdbcDaoSupport implements EmployeeDAO
{

	public List<Employee> findAll()
	{
		String sql = "SELECT * FROM EMPLOYEE";

		List<Map<String, Object>> list = getJdbcTemplate()
				.queryForList(sql);

		List<Employee> employeeList = new ArrayList<Employee>();

		for (Map<String, Object> map : list)
		{
			Employee employee = new Employee();
			employee.setEmployeeId((Long) map.get("EMPLOYEE_ID"));
			employee.setName((String) map.get("NAME"));
			employee.setAge((Integer) map.get("AGE"));
			employee.setSalary((Integer) map.get("SALARY"));
			employeeList.add(employee);
		}
		return employeeList;
	}

}
