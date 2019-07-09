import java.util.Arrays;

/**
 * 
 * public static void parallelSort(float[] a)
 * 
 * Sorts the specified array into ascending numerical order.
 * 
 * The sorting algorithm is a parallel sort-merge that breaks the
 * array into sub-arrays that are themselves sorted and then merged.
 * 
 * Parameters:
 * 
 * a - the array to be sorted
 * 
 */

public class ArraysDemo
{

	public static void main(String[] args)
	{
		float[] floatArray = { 8.1f, 9.2f, 4.4f, 3.5f, 5.2f, 1.3f };
		Arrays.parallelSort(floatArray);
		System.out.println(Arrays.toString(floatArray));
	}

}
