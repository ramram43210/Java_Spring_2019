import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{

		int[] intArray1 = new int[] { 3, 5, 2 };

		System.out.println("Printing intArray1:");
		printArrayDetails(intArray1);

		/*
		 * Copies the specified array, truncating or padding with
		 * zeros (if necessary) so the copy has the specified length.
		 *
		 * Parameters:
		 *
		 * original - the array to be copied
		 *
		 * newLength - the length of the copy to be returned
		 *
		 * Returns:
		 *
		 * a copy of the original array, truncated or padded with
		 * zeros to obtain the specified length
		 */

		int[] intArray2 = Arrays.copyOf(intArray1, 3);

		System.out.println("\nPrinting intArray2:");
		printArrayDetails(intArray2);

	}

	private static void printArrayDetails(int[] intArray)
	{
		for (int intValue : intArray)
		{
			System.out.println("intValue = " + intValue);
		}
	}

	private static void prlongArrayDetails(long[] longArray)
		{
			int i = 0;
			for (long longValue : longArray)
			{
				System.out.println("longArray["+ i +"] = " + longValue);
				++i;
			}
	}

}
