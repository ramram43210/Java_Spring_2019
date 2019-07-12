import java.util.Arrays;

public class ArraysDemo2
{

	public static void main(String[] args)
	{

		short[] shortArray = new short[] { 2, 7, 9, 7, 8 };

		System.out.println("Actual values: ");
		printArrayDetails(shortArray);

		/*
		 * Assigns the specified short value to each element of the
		 * specified range of the specified array of shorts. The range
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

		short shortValue = 1;
		Arrays.fill(shortArray, 1, 3, shortValue);

		System.out.println("\nNew values after using fill() method: ");

		printArrayDetails(shortArray);
	}

	private static void printArrayDetails(short[] shortArray)
	{
		for (short value : shortArray)
		{
			System.out.println("Value = " + value);
		}
	}

}
