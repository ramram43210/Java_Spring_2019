import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{

		int[] intArray1 = new int[] { 5, 10, 15 };

		System.out.println("Printing intArray1:");
		printArrayDetails(intArray1);

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

		int[] intArray2 = Arrays.copyOfRange(intArray1, 1, 5);

		System.out.println("\nPrinting intArray2:");
		printArrayDetails(intArray2);

	}

	private static void printArrayDetails(int[] intArray)
	{
		int i = 0;
		for (int intValue : intArray)
		{
			System.out.println("intArray[" + i + "] = " + intValue);
			++i;
		}
	}

}
