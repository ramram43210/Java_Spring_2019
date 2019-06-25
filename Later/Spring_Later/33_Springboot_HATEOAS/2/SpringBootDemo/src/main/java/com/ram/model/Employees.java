package com.ram.model;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;

import org.springframework.hateoas.ResourceSupport;

public final class Employees extends ResourceSupport
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
