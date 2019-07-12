import java.util.Arrays;

public class ArraysDemo2
{

	public static void main(String[] args)
	{

		int[] intArray = new int[] { 2, 7, 9, 7, 8 };

		System.out.println("Actual values: ");
		printArrayDetails(intArray);

		/*
		 * Assigns the specified int value to each element of the
		 * specified range of the specified array of ints. The range
		 * to be filled extends from index fromIndex, inclusive, to
		 * index toIndex, exclusive. (If fromIndex==toIndex, the range
		 * to be filled is empty.)
		 * 
		 * Parameters:
		 * 
		 * a - the array to be filled
		 * 
		 * fromIndex - the index of the first element (inclusive) to
		 * be filled with the specified value
		 * 
		 * toIndex - the index of the last element (exclusive) to be
		 * filled with the specified value
		 * 
		 * val - the value to be stored in all elements of the array
		 */

		int intValue = 1;
		Arrays.fill(intArray, 1, 3, intValue);

		System.out.println("\nNew values after using fill() method: ");

		printArrayDetails(intArray);
	}

	private static void printArrayDetails(int[] intArray)
	{
		for (int value : intArray)
		{
			System.out.println("Value = " + value);
		}
	}

}
