import java.util.Arrays;

public class ArraysDemo1
{

	public static void main(String[] args)
	{

		long[] longArray = new long[] { 2, 7, 9, 1, 6 };

		System.out.println("Actual values: ");
		prlongArrayDetails(longArray);

		/*
		 * Assigns the specified long value to each element of the
		 * specified array of longs.
		 * 
		 * Parameters:
		 * 
		 * a - the array to be filled
		 * 
		 * val - the value to be stored in all elements of the array
		 */

		long longValue = 8;
		Arrays.fill(longArray, longValue);

		System.out.println("\nNew values after using fill() method: ");

		prlongArrayDetails(longArray);

	}

	private static void prlongArrayDetails(long[] longArray)
	{
		for (long value : longArray)
		{
			System.out.println("Value = " + value);
		}
	}

}
