package com.ram.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.hateoas.ResourceSupport;

@Entity

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "employee")

public class Employee extends ResourceSupport
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@XmlAttribute(name = "id")
	private int employeeId;

	@XmlElement(name = "name")
	private String name;

	@XmlElement(name = "age")
	private int age;

	@XmlElement(name = "salary")
	private int salary;

	public int getEmployeeId()
	{
		return employeeId;
	}
	

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public int getSalary()
	{
		return salary;
	}

	public void setSalary(int salary)
	{
		this.salary = salary;
	}

	@Override
	public String toString()
	{
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", age=" + age
				+ ", salary=" + salary + "]";
	}

}
