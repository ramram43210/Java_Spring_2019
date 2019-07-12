import java.util.Arrays;

/**
 * 
 * public static void setAll(long[] array,
                          IntToLongFunction generator)
 * 
 * Set all elements of the specified array, using the provided
 * generator function to compute each element.
 * 
 * Parameters:
 * 
 * array - array to be initialized
 * 
 * generator - a function accepting an index and producing the desired
 * value for that position
 */

public class ArraysDemo2
{

	public static void main(String[] args)
	{
		long[] longArray = new long[5];
		Arrays.setAll(longArray, (index) -> index * 20);
		System.out.println(Arrays.toString(longArray));
	}

}
