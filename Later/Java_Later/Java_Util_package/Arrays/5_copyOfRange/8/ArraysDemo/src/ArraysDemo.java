import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{

		boolean[] booleanArray1 = new boolean[] { true, true, true };

		System.out.println("Printing booleanArray1:");
		printArrayDetails(booleanArray1);

		/*
		 * Copies the specified range of the specified array booleano
		 * a new array.
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
		 * original array, truncated or padded with false elements to
		 * obtain the required length
		 */

		boolean[] booleanArray2 = Arrays.copyOfRange(booleanArray1, 1, 5);

		System.out.println("\nPrinting booleanArray2:");
		printArrayDetails(booleanArray2);

	}

	private static void printArrayDetails(boolean[] booleanArray)
	{
		int i = 0;
		for (boolean booleanValue : booleanArray)
		{
			System.out.println("booleanArray[" + i + "] = " + booleanValue);
			++i;
		}
	}

}
