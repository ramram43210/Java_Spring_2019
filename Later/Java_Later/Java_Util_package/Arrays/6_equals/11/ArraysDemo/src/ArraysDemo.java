import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{

		Employee a1[][] = {
				{ new Employee(10, "Peter1"), new Employee(11, "Peter2") },
				{ new Employee(12, "Peter3"), new Employee(13, "Peter4") } };

		Employee a2[][] = {
				{ new Employee(10, "Peter1"), new Employee(11, "Peter2") },
				{ new Employee(12, "Peter3"), new Employee(13, "Peter4") } };

		Employee a3[][] = {
				{ new Employee(12, "Peter2"), new Employee(25, "Peter4") },
				{ new Employee(15, "Peter3"), new Employee(30, "Peter1") } };

		/*
		 * Returns true if the two specified arrays are deeply equal
		 * to one another.
		 * 
		 * Parameters:
		 * 
		 * a1 - one array to be tested for equality
		 * 
		 * a2 - the other array to be tested for equality
		 * 
		 * Returns:
		 * 
		 * true if the two arrays are equal
		 */

		System.out.println(
				"Check if a1 is equal to a2 = " + Arrays.deepEquals(a1, a2));

		System.out.println(
				"Check if a2 is equal to a3 = " + Arrays.deepEquals(a2, a3));

		System.out.println(
				"Check if a1 is equal to a3 = " + Arrays.deepEquals(a1, a3));
	}

}
