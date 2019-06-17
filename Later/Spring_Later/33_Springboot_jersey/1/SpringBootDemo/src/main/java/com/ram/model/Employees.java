package com.ram.model;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;

public final class Employees
{

	@XmlElement(name = "employees")
	private ArrayList<Employee> employees;

	public ArrayList<Employee> getEmployees()
	{
		return employees;
	}

	public void setEmployees(ArrayList<Employee> employees)
	{
		this.employees = employees;
	}

}
