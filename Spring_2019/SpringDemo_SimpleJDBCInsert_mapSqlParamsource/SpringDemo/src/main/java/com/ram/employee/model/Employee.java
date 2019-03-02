package com.ram.employee.model;

public class Employee
{
	private int employeeId;
	private String name;
	private int age;
	private int salary;

	public Employee(String name, int age, int salary)
	{
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public int getEmployeeId()
	{
		return employeeId;
	}

	public void setEmployeeId(int employeeId)
	{
		this.employeeId = employeeId;
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
		return "Employee [employeeId=" + employeeId + ", name=" + name
				+ ", age=" + age + ", salary=" + salary + "]";
	}

}
