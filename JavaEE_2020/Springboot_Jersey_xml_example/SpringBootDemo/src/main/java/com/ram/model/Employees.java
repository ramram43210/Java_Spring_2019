package com.ram.model;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "employees")
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
