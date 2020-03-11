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

@Entity
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "employee")

public class Employee
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@XmlAttribute(name = "id")
	private int id;
	
	@XmlElement(name = "name")
	private String name;
	
	@XmlElement(name = "age")
	private int age;
	
	@XmlElement(name = "salary")
	private int salary;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
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
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary
				+ "]";
	}

}
