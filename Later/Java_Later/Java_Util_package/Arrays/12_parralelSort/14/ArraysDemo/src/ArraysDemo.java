import java.util.Arrays;

/**
 * 
 * public static void parallelSort(char[] a, int fromIndex, int
 * 															toIndex)
 * 
 * Sorts the specified range of the array into ascending numerical
 * order. The range to be sorted extends from the index fromIndex,
 * inclusive, to the index toIndex, exclusive.
 * 
 * The sorting algorithm is a parallel sort-merge that breaks the
 * array into sub-arrays that are themselves sorted and then merged.
 * 
 * Parameters:
 * 
 * a - the array to be sorted
 * 
 * fromIndex - the index of the first element, inclusive, to be sorted
 * 
 * toIndex - the index of the last element, exclusive, to be sorted
 */

public class ArraysDemo
{

	public static void main(String[] args)
	{
		char[] charArray = { 'c', 'b', 'e', 'd', 'f', 'a' };
		Arrays.parallelSort(charArray, 0, 4);
		System.out.println(Arrays.toString(charArray));
	}

}
