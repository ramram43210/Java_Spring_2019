import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{

		short[] shortArray1 = new short[] { 3, 5, 2 };

		System.out.println("Printing shortArray1:");
		printArrayDetails(shortArray1);

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

		short[] shortArray2 = Arrays.copyOf(shortArray1, 3);

		System.out.println("\nPrinting shortArray2:");
		printArrayDetails(shortArray2);

	}

	private static void printArrayDetails(short[] shortArray)
	{
		for (short shortValue : shortArray)
		{
			System.out.println("shortValue = " + shortValue);
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
