package com.ram.batch;

import org.springframework.batch.item.ItemProcessor;

import com.ram.model.Employee;

/**
 * Intermediate processor to do the operations after the reading the data from the CSV file and
 * before writing the data into SQL.
 */
public class EmployeeItemProcessor implements ItemProcessor<Employee, Employee>
{
	@Override
	public Employee process(final Employee user) throws Exception
	{
		final String name = user.getName().toUpperCase();
		final Employee transformedPerson = new Employee(name, user.getAge(), user.getSalary());

		System.out.println("Converting (" + user + ") into (" + transformedPerson + ")");
		return transformedPerson;
	}
}
