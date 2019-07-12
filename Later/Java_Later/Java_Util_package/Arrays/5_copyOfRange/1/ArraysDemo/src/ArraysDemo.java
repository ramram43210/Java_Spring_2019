import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{

		byte[] byteArray1 = new byte[] { 5, 10, 15 };

		System.out.println("Printing byteArray1:");
		printArrayDetails(byteArray1);

		/*
		 * Copies the specified range of the specified array into a
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

		byte[] byteArray2 = Arrays.copyOfRange(byteArray1, 1, 5);

		System.out.println("\nPrinting byteArray2:");
		printArrayDetails(byteArray2);

	}

	private static void printArrayDetails(byte[] byteArray)
	{
		int i = 0;
		for (byte byteValue : byteArray)
		{
			System.out.println("byteArray[" + i + "] = " + byteValue);
			++i;
		}
	}

}
