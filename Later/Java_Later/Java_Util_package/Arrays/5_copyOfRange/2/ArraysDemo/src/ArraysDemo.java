import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{

		short[] shortArray1 = new short[] { 5, 10, 15 };

		System.out.println("Printing shortArray1:");
		printArrayDetails(shortArray1);

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

		short[] shortArray2 = Arrays.copyOfRange(shortArray1, 1, 5);

		System.out.println("\nPrinting shortArray2:");
		printArrayDetails(shortArray2);

	}

	private static void printArrayDetails(short[] shortArray)
	{
		int i = 0;
		for (short shortValue : shortArray)
		{
			System.out.println("shortArray[" + i + "] = " + shortValue);
			++i;
		}
	}

}
