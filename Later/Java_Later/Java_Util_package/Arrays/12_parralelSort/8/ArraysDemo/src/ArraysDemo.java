import java.util.Arrays;

/**
 *
 * public static void parallelSort(float[] a,
                                int fromIndex,
                                int toIndex)
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
 * fromIndex - the index of the first element, inclusive, to be sorted
 *
 * toIndex - the index of the last element, exclusive, to be sorted
 *
 */

public class ArraysDemo
{

	public static void main(String[] args)
	{
		float[] floatArray = { 8.1f, 9.2f, 4.4f, 3.5f, 5.2f, 1.3f };
		Arrays.parallelSort(floatArray, 0, 4);
		System.out.println(Arrays.toString(floatArray));
	}

}
