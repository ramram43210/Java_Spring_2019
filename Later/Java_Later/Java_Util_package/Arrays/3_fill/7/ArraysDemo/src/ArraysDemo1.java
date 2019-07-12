import java.util.Arrays;

public class ArraysDemo1
{

	public static void main(String[] args)
	{

		Object[] objectArray = new Object[] { 2.1, 7.2, 9.4, 1.4, 6.5 };

		System.out.println("Actual values: ");
		prObjectArrayDetails(objectArray);

		/*
		 * Assigns the specified Object reference to each element of
		 * the specified array of Objects.
		 * 
		 * Parameters:
		 * 
		 * a - the array to be filled
		 * 
		 * val - the value to be stored in all elements of the array
		 */

		Object objectValue = 8.9;
		Arrays.fill(objectArray, objectValue);

		System.out.println("\nNew values after using fill() method: ");

		prObjectArrayDetails(objectArray);

	}

	private static void prObjectArrayDetails(Object[] ObjectArray)
	{
		for (Object objectValue : ObjectArray)
		{
			System.out.println("objectValue = " + objectValue);
		}
	}

}
