import java.util.Arrays;

/**
 * 
 * public static void setAll(double[] array,
                          IntToDoubleFunction generator)
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

public class ArraysDemo
{

	public static void main(String[] args)
	{
		double[] doubleArray = new double[5];
		Arrays.setAll(doubleArray, (index) -> index + 10.5);
		System.out.println(Arrays.toString(doubleArray));
	}

}
