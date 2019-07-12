import java.util.Arrays;

public class ArraysDemo2
{

	public static void main(String[] args)
	{

		Object[] objectArray = new Object[] { 2.1, 7.2, 9.4, 1.4, 6.5 };

		System.out.println("Actual values: ");
		prObjectArrayDetails(objectArray);

		/*
		 * Assigns the specified Object reference to each element of
		 * the specified range of the specified array of Objects. The
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

		Object objectValue = 8.9;
		Arrays.fill(objectArray, 1, 3, objectValue);

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
