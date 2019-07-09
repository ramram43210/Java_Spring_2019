import java.util.Arrays;

public class ArraysDemo1
{

	public static void main(String[] args)
	{

		float[] floatArray = { 10.1f, 5.9f, 8.6f, 90.4f, 50.2f, 40.5f };

		Arrays.sort(floatArray);

		System.out.println("The sorted int array is:");
		int i = 0;
		for (float number : floatArray)
		{
			System.out.println("Index = " + i + ", Number = " + number);
			++i;
		}

		/*
		 * Searches the specified array of floats for the specified
		 * value using the binary search algorithm.
		 * 
		 * The array must be sorted (as by the sort(float[]) method)
		 * prior to making this call. If it is not sorted, the results
		 * are undefined.
		 * 
		 * If the array contains multiple elements with the specified
		 * value, there is no guarantee which one will be found.
		 * 
		 * Parameters:
		 * 
		 * a - the array to be searched
		 * 
		 * key - the value to be searched for
		 * 
		 * Returns:
		 * 
		 * index of the search key, if it is contained in the array;
		 * otherwise, (-(insertion point) - 1).
		 */
		float searchKey = 40.5f;
		int indexOfSearchKey = Arrays.binarySearch(floatArray, searchKey);

		System.out.println(
				"indexOfSearchKey " + searchKey + " is =  " + indexOfSearchKey);
	}

}
