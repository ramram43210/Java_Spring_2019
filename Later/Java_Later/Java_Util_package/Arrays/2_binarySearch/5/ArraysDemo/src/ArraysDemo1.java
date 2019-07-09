import java.util.Arrays;

public class ArraysDemo1
{

	public static void main(String[] args)
	{

		double[] doubleArray = { 10.1, 5.9, 8.6, 90.4, 50.2, 40.5 };

		Arrays.sort(doubleArray);

		System.out.println("The sorted int array is:");
		int i = 0;
		for (double number : doubleArray)
		{
			System.out.println("Index = " + i + ", Number = " + number);
			++i;
		}

		/*
		 * Searches the specified array of doubles for the specified
		 * value using the binary search algorithm.
		 * 
		 * The array must be sorted (as by the sort(double[]) method)
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
		double searchKey = 40.5;
		int indexOfSearchKey = Arrays.binarySearch(doubleArray, searchKey);

		System.out.println(
				"indexOfSearchKey " + searchKey + " is =  " + indexOfSearchKey);
	}

}
