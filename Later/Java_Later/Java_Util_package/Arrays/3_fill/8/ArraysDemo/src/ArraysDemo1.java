import java.util.Arrays;

public class ArraysDemo1
{

	public static void main(String[] args)
	{

		char[] charArray = new char[] { 'a', 'b', 'c', 'd', 'e' };

		System.out.println("Actual values: ");
		printArrayDetails(charArray);

		/*
		 * Assigns the specified char value to each element of the
		 * specified array of chars.
		 * 
		 * Parameters:
		 * 
		 * a - the array to be filled
		 * 
		 * val - the value to be stored in all elements of the array
		 */

		char charValue = 'z';
		Arrays.fill(charArray, charValue);

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
