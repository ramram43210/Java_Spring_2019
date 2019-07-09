import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{

		byte[] byteArray1 = new byte[] { 3, 5, 2 };

		System.out.println("Printing byteArray1:");
		printArrayDetails(byteArray1);

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

		byte[] byteArray2 = Arrays.copyOf(byteArray1, 3);

		System.out.println("\nPrinting byteArray2:");
		printArrayDetails(byteArray2);

	}

	private static void printArrayDetails(byte[] byteArray)
	{
		for (byte byteValue : byteArray)
		{
			System.out.println("byteValue = " + byteValue);
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
