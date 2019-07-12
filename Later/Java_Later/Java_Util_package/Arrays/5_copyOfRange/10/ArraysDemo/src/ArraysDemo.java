import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{

		Integer[] integerArray1 = new Integer[] { 5, 10, 15 };

		System.out.println("printing integerArray1:");
		printIntegerArrayDetails(integerArray1);

		/*
		 * copyOfRange public static <T,U> T[] copyOfRange(U[]
		 * original, int from, int to, Class<? extends T[]> newType)
		 * 
		 * 
		 * Type Parameters:
		 * 
		 * U - the class of the objects in the original array
		 * 
		 * T - the class of the objects in the array
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
		 * newType - the class of the copy to be returned Returns:
		 *
		 * a new array containing the specified range from the
		 * original array, truncated or padded with nulls to obtain
		 * the required length
		 */

		Number[] numberArray = Arrays.copyOfRange(integerArray1, 1, 5,
				Number[].class);

		System.out.println("\nprinting numberArray:");
		printNumberArrayDetails(numberArray);

	}

	private static void printIntegerArrayDetails(Integer[] integerArray)
	{
		Integer i = 0;
		for (Integer integerValue : integerArray)
		{
			System.out.println("integerArray[" + i + "] = " + integerValue);
			++i;
		}
	}

	private static void printNumberArrayDetails(Number[] numberArray)
	{
		Integer i = 0;
		for (Number numberValue : numberArray)
		{
			System.out.println("numberArray[" + i + "] = " + numberValue);
			++i;
		}
	}

}
