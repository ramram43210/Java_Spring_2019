import java.util.Arrays;

public class ArraysDemo2
{

	public static void main(String[] args)
	{

		char[] charArray = new char[] { 'a', 'b', 'c', 'd', 'e' };

		System.out.println("Actual values: ");
		printArrayDetails(charArray);

		/*
		 * Assigns the specified char value to each element of the
		 * specified range of the specified array of chars. The range
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

		char charValue = 'z';
		Arrays.fill(charArray, 1, 4, charValue);

		System.out.println("\nNew values after using fill() method: ");

		printArrayDetails(charArray);

	}

	private static void printArrayDetails(char[] charArray)
	{
		for (char charValue : charArray)
		{
			System.out.println("charValue = " + charValue);
		}
	}
}
