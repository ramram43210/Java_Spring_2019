import java.util.Arrays;

public class ArraysDemo2
{

	public static void main(String[] args)
	{

		byte byteArray[] = new byte[] { 2, 7, 9, 7, 8 };

		System.out.println("Actual values: ");
		for (byte value : byteArray)
		{
			System.out.println("Value = " + value);
		}

		/*
		 * Assigns the specified byte value to each element of the
		 * specified range of the specified array of bytes. The range
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
		Arrays.fill(byteArray, 1, 3, (byte) 8);

		System.out.println("New values after using fill() method: ");

		for (byte value : byteArray)
		{
			System.out.println("Value = " + value);
		}

	}

}
