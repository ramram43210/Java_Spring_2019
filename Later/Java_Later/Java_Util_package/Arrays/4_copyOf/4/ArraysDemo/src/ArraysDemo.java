import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{

		long[] longArray1 = new long[] { 3, 5, 2 };

		System.out.println("Prlonging longArray1:");
		prlongArrayDetails(longArray1);

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

		long[] longArray2 = Arrays.copyOf(longArray1, 3);

		System.out.println("\nPrlonging longArray2:");
		prlongArrayDetails(longArray2);

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
