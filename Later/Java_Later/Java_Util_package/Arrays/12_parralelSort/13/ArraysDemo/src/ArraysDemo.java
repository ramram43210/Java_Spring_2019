import java.util.Arrays;

/**
 * 
 * public static void parallelSort(char[] a)
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
		char[] charArray = { 'c', 'b', 'e', 'd', 'f', 'a' };
		Arrays.parallelSort(charArray);
		System.out.println(Arrays.toString(charArray));
	}

}
