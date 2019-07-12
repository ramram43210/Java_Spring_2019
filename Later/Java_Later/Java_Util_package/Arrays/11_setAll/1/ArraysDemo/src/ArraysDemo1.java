import java.util.Arrays;

/**
 * 
 * public static void setAll(int[] array, IntUnaryOperator generator)
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

public class ArraysDemo1
{

	public static void main(String[] args)
	{
		int[] intArray = new int[5];
		Arrays.setAll(intArray, (index) -> index * 10);
		System.out.println(Arrays.toString(intArray));
	}

}
