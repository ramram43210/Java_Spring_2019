import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{
		int a1[][] = { { 10, 20 }, { 40, 50 }, { 60, 70 } };

		int a2[][] = { { 30, 20 }, { 10, 0 }, { 60, 80 } };

		int a3[][] = { { 10, 20 }, { 40, 50 }, { 60, 70 } };

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
