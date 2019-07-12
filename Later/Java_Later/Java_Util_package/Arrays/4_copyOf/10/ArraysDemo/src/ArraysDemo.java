import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{

		Integer[] integerArray = new Integer[] { 2, 4, 6 };

		System.out.println("Printing integerArray:");
		int i = 0;
		for (Integer integerValue : integerArray)
		{
			System.out.println("integerArray[" + i + "] = " + integerValue);
			++i;
		}

		/*
		 * public static <T,U> T[] copyOf(U[] original, int newLength,
		 * 										Class<? extends T[]> newType)
		 * 
		 * Copies the specified array, truncating or padding with
		 * zeros (if necessary) so the copy has the specified length.
		 * 
		 * Type Parameters:
		 * 
		 * U - the class of the objects in the original array
		 * T - the class of the objects in the returned array
		 * 
		 * Parameters:
		 * 
		 * original - the array to be copied
		 * 
		 * newLength - the length of the copy to be returned
		 * 
		 * newType - the class of the copy to be returned
		 * 
		 * Returns:
		 * 
		 * a copy of the original array, truncated or padded with
		 * zeros to obtain the specified length
		 */

		Number[] numberArray = Arrays.copyOf(integerArray, 3, Number[].class);

		System.out.println("\nPrinting doubleArray:");
		int j = 0;
		for (Number numberValue : numberArray)
		{
			System.out.println("numberArray[" + j + "] = " + numberValue);
			++j;
		}

	}

}
