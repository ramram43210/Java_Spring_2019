package com.ram.employee.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.ram.employee.dao.EmployeeDAO;
import com.ram.employee.model.Employee;

public class EmployeeDAOImpl extends JdbcDaoSupport implements EmployeeDAO
{

	public List<Employee> findAll()
	{
		return getJdbcTemplate().query("SELECT * FROM EMPLOYEE",
				new ResultSetExtractor<List<Employee>>()
				{
					public List<Employee> extractData(ResultSet rs)
							throws SQLException, DataAccessException
					{

						List<Employee> employeeList = new ArrayList<Employee>();
						while (rs.next())
						{
							Employee employee = new Employee();
							employee.setEmployeeId(rs.getInt(1));
							employee.setName(rs.getString(2));
							employee.setAge(rs.getInt(3));
							employee.setSalary(rs.getInt(4));
							employeeList.add(employee);
						}
						return employeeList;
					}
				});
	}

}
