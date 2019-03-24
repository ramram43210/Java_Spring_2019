package com.ram.core.dao.impl;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.ram.core.dao.EmployeeDAO;
import com.ram.core.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO
{

	private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate)
	{
		this.hibernateTemplate = hibernateTemplate;
	}

	public void save(Employee employee)
	{
		hibernateTemplate.save(employee);
	}

	public Employee get(int employeeId)
	{

		Employee employee = hibernateTemplate.get(Employee.class, new Integer(employeeId));
		return employee;
	}

}
