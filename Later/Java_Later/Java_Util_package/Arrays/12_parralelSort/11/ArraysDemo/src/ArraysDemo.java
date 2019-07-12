import java.util.Arrays;

/**
 * 
 * public static void parallelSort(byte[] a)
 * 
 * Sorts the specified range of the array into ascending numerical
 * order.
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
		byte[] byteArray = { 8, 9, 4, 3, 5, 1 };
		Arrays.parallelSort(byteArray);
		System.out.println(Arrays.toString(byteArray));
	}

}
