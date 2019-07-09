import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{

		char[] charArray1 = new char[] { 'a', 'b', 'c' };

		System.out.println("Printing charArray1:");
		printArrayDetails(charArray1);

		/*
		 * Copies the specified range of the specified array charo a
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
		 * original array, truncated or padded with null characters to
		 * obtain the required length
		 */

		char[] charArray2 = Arrays.copyOfRange(charArray1, 1, 5);

		System.out.println("\nPrinting charArray2:");
		printArrayDetails(charArray2);

	}

	private static void printArrayDetails(char[] charArray)
	{
		int i = 0;
		for (char charValue : charArray)
		{
			System.out.println("charArray[" + i + "] = " + charValue);
			++i;
		}
	}

}
