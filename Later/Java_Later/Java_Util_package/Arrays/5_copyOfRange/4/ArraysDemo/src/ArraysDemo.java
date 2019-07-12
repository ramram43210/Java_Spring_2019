import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{

		long[] longArray1 = new long[] { 5, 10, 15 };

		System.out.println("Printing longArray1:");
		printArrayDetails(longArray1);

		/*
		 * Copies the specified range of the specified array longo a
		 * new array.
		 *
		 * Parameters:
		 *
		 * original - the array from which a range is to be copied
		 * 
		 * from - the initial index of the range to be copied,
		 * inclusive
		 * 
		 * to - the final index of the range to be copied, exclusive.
		 * (This index may lie outside the array.)
		 *
		 * Returns:
		 *
		 * a new array containing the specified range from the
		 * original array, truncated or padded with zeros to obtain
		 * the required length
		 */

		long[] longArray2 = Arrays.copyOfRange(longArray1, 1, 5);

		System.out.println("\nPrinting longArray2:");
		printArrayDetails(longArray2);

	}

	private static void printArrayDetails(long[] longArray)
	{
		long i = 0;
		for (long longValue : longArray)
		{
			System.out.println("longArray[" + i + "] = " + longValue);
			++i;
		}
	}

}
