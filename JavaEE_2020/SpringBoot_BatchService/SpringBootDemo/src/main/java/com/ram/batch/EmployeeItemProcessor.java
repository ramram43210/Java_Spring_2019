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
	public Employee process(final Employee employee) throws Exception
	{
		System.out.println("-----------Inside process(final Employee employee) method--------");
		final String name = employee.getName().toUpperCase();
		final Employee transformedPerson = new Employee(name, employee.getAge(), employee.getSalary());

		System.out.println("Converting (" + employee + ") into (" + transformedPerson + ")");
		return transformedPerson;
	}
}
