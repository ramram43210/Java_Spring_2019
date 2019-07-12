import java.util.Arrays;

public class ArraysDemo2
{

	public static void main(String[] args)
	{

		long[] longArray = new long[] { 2, 7, 9, 1, 6 };

		System.out.println("Actual values: ");
		prlongArrayDetails(longArray);

		/*
		 * Assigns the specified long value to each element of the
		 * specified range of the specified array of longs. The range
		 * to be filled extends from index fromIndex, inclusive, to
		 * index toIndex, exclusive. (If fromIndex==toIndex, the range
		 * to be filled is empty.)
		 * 
		 * Parameters:
		 * 
		 * a - the array to be filled
		 * 
		 * fromIndex - the index of the first element (inclusive) to
		 * be filled with the specified value
		 * 
		 * toIndex - the index of the last element (exclusive) to be
		 * filled with the specified value
		 * 
		 * val - the value to be stored in all elements of the array
		 */

		long longValue = 8;
		Arrays.fill(longArray, 1, 3, longValue);

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
