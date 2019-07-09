import java.util.Arrays;

public class ArraysDemo1
{

	public static void main(String[] args)
	{

		int[] intArray = new int[] { 2, 7, 9, 7, 8 };

		System.out.println("Actual values: ");
		printArrayDetails(intArray);

		/*
		 * Assigns the specified int value to each element of the
		 * specified array of ints.
		 * 
		 * Parameters:
		 * 
		 * a - the array to be filled
		 * 
		 * val - the value to be stored in all elements of the array
		 */

		int intValue = 8;
		Arrays.fill(intArray, intValue);

		System.out.println("\nNew values after using fill() method: ");

		printArrayDetails(intArray);

	}

	private static void printArrayDetails(int[] intArray)
	{
		for (int value : intArray)
		{
			System.out.println("Value = " + value);
		}
	}

}
