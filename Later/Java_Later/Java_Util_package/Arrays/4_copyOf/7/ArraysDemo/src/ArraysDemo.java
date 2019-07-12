import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{

		char[] charArray1 = new char[] {'a', 'v', 'g'};

		System.out.println("Printing charArray1:");
		printArrayDetails(charArray1);

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

		char[] charArray2 = Arrays.copyOf(charArray1, 3);

		System.out.println("\nPrinting charArray2:");
		printArrayDetails(charArray2);

	}

	private static void printArrayDetails(char[] charArray)
	{
		int i = 0;
		for (char charValue : charArray)
		{
			System.out.println("char["+ i +"] = " + charValue);
			++i;
		}
	}

}
