import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{

		Employee[] employeeArray = new Employee[4];

		employeeArray[0] = new Employee("Peter", 24, 80000);
		employeeArray[1] = new Employee("Ram", 12, 75000);
		employeeArray[2] = new Employee("Alex", 34, 120000);
		employeeArray[3] = new Employee("John", 28, 60000);

		System.out.println("Before Sort= " + Arrays.toString(employeeArray));

		/*
		 * public static void sort(Object[] a)
		 * 
		 * Sorts the specified array of objects into ascending order,
		 * according to the natural ordering of its elements. All
		 * elements in the array must implement the Comparable
		 * interface
		 * 
		 * Parameters:
		 * 
		 * a - the array to be sorted
		 * 
		 */
		Arrays.sort(employeeArray);
		System.out.println("\nAfter Sort = " + Arrays.toString(employeeArray));
	}

}
