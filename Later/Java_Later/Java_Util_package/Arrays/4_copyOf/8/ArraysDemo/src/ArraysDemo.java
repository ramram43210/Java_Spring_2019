import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{

		boolean[] booleanArray1 = new boolean[] { true, false, true };

		System.out.println("Printing booleanArray1:");
		printArrayDetails(booleanArray1);

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

		boolean[] booleanArray2 = Arrays.copyOf(booleanArray1, 3);

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
