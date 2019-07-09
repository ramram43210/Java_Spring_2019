import java.util.Arrays;

public class ArraysDemo2
{

	public static void main(String[] args)
	{

		boolean[] booleanArray = new boolean[] { true, true, true, true, true };

		System.out.println("Actual values: ");
		printArrayDetails(booleanArray);

		/*
		 * Assigns the specified boolean value to each element of the
		 * specified range of the specified array of booleans. The
		 * range to be filled extends from index fromIndex, inclusive,
		 * to index toIndex, exclusive. (If fromIndex==toIndex, the
		 * range to be filled is empty.)
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

		boolean booleanValue = false;
		Arrays.fill(booleanArray, 1, 4, booleanValue);

		System.out.println("\nNew values after using fill() method: ");

		printArrayDetails(booleanArray);

	}

	private static void printArrayDetails(boolean[] booleanArray)
	{
		for (boolean booleanValue : booleanArray)
		{
			System.out.println("booleanValue = " + booleanValue);
		}
	}
}
