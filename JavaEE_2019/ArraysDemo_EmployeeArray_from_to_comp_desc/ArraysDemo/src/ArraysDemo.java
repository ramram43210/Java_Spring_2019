import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArraysDemo
{
	public static void main(String[] args)
	{
		Employee[] employeeArray = new Employee[5];
		employeeArray[0] = new Employee("Peter", 24, 80000);
		employeeArray[1] = new Employee("Ram", 12, 75000);
		employeeArray[2] = new Employee("Alex", 34, 120000);
		employeeArray[3] = new Employee("John", 28, 90000);
		employeeArray[4] = new Employee("David", 38, 200000);

		System.out.println("Before Sort = " + Arrays.toString(employeeArray));

		EmployeeSalaryComparator employeeSalaryComparator = new EmployeeSalaryComparator();

		/*
		 * This method returns a comparator that imposes the reverse
		 * ordering of the specified comparator.
		 */
		Comparator<Employee> descendingEmployeeSalaryComparator = Collections
				.reverseOrder(employeeSalaryComparator);

		Arrays.sort(employeeArray, 0, 3, descendingEmployeeSalaryComparator);
		System.out.println("\nAfter Sort = " + Arrays.toString(employeeArray));
	}

}
