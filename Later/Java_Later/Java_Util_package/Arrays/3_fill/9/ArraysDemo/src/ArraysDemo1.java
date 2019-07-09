import java.util.Arrays;

public class ArraysDemo1
{

	public static void main(String[] args)
	{

		boolean[] booleanArray = new boolean[] { true, true, true, true, true };

		System.out.println("Actual values: ");
		printArrayDetails(booleanArray);

		/*
		 * Assigns the specified boolean value to each element of the
		 * specified array of booleans.
		 * 
		 * Parameters:
		 * 
		 * a - the array to be filled
		 * 
		 * val - the value to be stored in all elements of the array
		 */

		boolean booleanValue = false;
		Arrays.fill(booleanArray, booleanValue);

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
