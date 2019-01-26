package com.ram.employee.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.ram.employee.dao.EmployeeDAO;
import com.ram.employee.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO
{
	private DataSource dataSource;

	public void setDataSource(DataSource dataSource)
	{
		this.dataSource = dataSource;
	}

	public void insert(Employee employee)
	{

		String sql = "INSERT INTO EMPLOYEE "
				+ "(EMPLOYEE_ID, NAME, AGE,SALARY) VALUES (?, ?, ?,?)";
		Connection conn = null;

		try
		{
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, employee.getEmployeeId());
			ps.setString(2, employee.getName());
			ps.setInt(3, employee.getAge());
			ps.setInt(4, employee.getSalary());
			ps.executeUpdate();
			ps.close();

		}
		catch (SQLException e)
		{
			throw new RuntimeException(e);

		}
		finally
		{
			if (conn != null)
			{
				try
				{
					conn.close();
				}
				catch (SQLException e)
				{
				}
			}
		}
	}

	public Employee findByEmployeeId(int employeeId)
	{

		String sql = "SELECT * FROM EMPLOYEE WHERE EMPLOYEE_ID = ?";

		Connection conn = null;

		try
		{
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, employeeId);
			Employee employee = null;
			ResultSet rs = ps.executeQuery();
			if (rs.next())
			{
				employee = new Employee(rs.getInt("EMPLOYEE_ID"),
						rs.getString("NAME"), rs.getInt("AGE"),
						rs.getInt("SALARY"));
			}
			rs.close();
			ps.close();
			return employee;
		}
		catch (SQLException e)
		{
			throw new RuntimeException(e);
		}
		finally
		{
			if (conn != null)
			{
				try
				{
					conn.close();
				}
				catch (SQLException e)
				{
				}
			}
		}
	}

}
