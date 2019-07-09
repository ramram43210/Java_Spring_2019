import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{

		Integer[] integerArray1 = new Integer[] { 2, 4, 6 };

		System.out.println("Printing integerArray1:");
		printArrayDetails(integerArray1);

		/*
		 * public static <T> T[] copyOf(T[] original, int newLength)
		 * 
		 * Copies the specified array, truncating or padding with
		 * zeros (if necessary) so the copy has the specified length.
		 * 
		 * Type Parameters:
		 * 
		 * T - the class of the objects in the array
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

		Integer[] integerArray2 = Arrays.copyOf(integerArray1, 3);

		System.out.println("\nPrinting integerArray2:");
		printArrayDetails(integerArray2);

	}

	private static void printArrayDetails(Integer[] integerArray)
	{
		int i = 0;
		for (Integer integerValue : integerArray)
		{
			System.out.println("integerArray[" + i + "] = " + integerValue);
			++i;
		}
	}

}
