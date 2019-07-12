import java.util.Arrays;

/**
 * 
 * public static void parallelSort(double[] a)
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
		double[] doubleArray = { 8.1, 9.2, 4.4, 3.5, 5.2, 1.3 };
		Arrays.parallelSort(doubleArray);
		System.out.println(Arrays.toString(doubleArray));
	}

}
