import java.util.Arrays;

/**
 * 
 * public static <T> void setAll(T[] array, IntFunction<? extends T>
 * generator)
 * 
 * Set all elements of the specified array, using the provided
 * generator function to compute each element.
 * 
 * Type Parameters:
 *  
 * T - type of elements of the array
 * 
 * Parameters:
 * 
 * array - array to be initialized
 * 
 * generator - a function accepting an index and producing the desired
 * value for that position
 */

public class ArraysDemo
{

	public static void main(String[] args)
	{
		Integer[] integerArray = new Integer[5];
		Arrays.setAll(integerArray, (index) -> index + 10);
		System.out.println(Arrays.toString(integerArray));
	}

}
