import java.util.Arrays;

/**
 * 
 * public static void parallelSort(long[] a)
 * 
 * Sorts the specified array into ascending numerical order.
 * 
 * The sorting algorithm is a parallel sort-merge that breaks the
 * array into sub-arrays that are themselves sorted and then merged.
 * 
 * Parameters:
 * 
 * a - the array to be sorted
 */

public class ArraysDemo
{

	public static void main(String[] args)
	{
		long[] longArray = { 8, 9, 4, 3, 5, 1 };
		Arrays.parallelSort(longArray);
		System.out.println(Arrays.toString(longArray));
	}

}
