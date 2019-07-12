import java.util.Arrays;

public class ArraysDemo2
{

	public static void main(String[] args)
	{

		byte[] byteArray = { 10, 5, 8, 90, 50, 40 };

		Arrays.sort(byteArray);

		System.out.println("The sorted int array is:");
		int i = 0;
		for (byte number : byteArray)
		{
			System.out.println("Index = " + i + ", Number = " + number);
			++i;
		}

		/*
		 * Searches a range of the specified array of bytes for the
		 * specified value using the binary search algorithm.
		 * 
		 * The range must be sorted (as by the sort(byte[], int, int)
		 * method) prior to making this call. If it is not sorted, the
		 * results are undefined.
		 * 
		 * If the range contains multiple elements with the specified
		 * value, there is no guarantee which one will be found.
		 * 
		 * Parameters:
		 * 
		 * a - the array to be searched
		 * 
		 * fromIndex - the index of the first element (inclusive) to
		 * be searched
		 * 
		 * toIndex - the index of the last element (exclusive) to be
		 * searched
		 * 
		 * key - the value to be searched for
		 * 
		 * Returns:
		 * 
		 * index of the search key, if it is contained in the array;
		 * otherwise, (-(insertion point) - 1).
		 */
		byte searchKey = 8;
		int indexOfSearchKey = Arrays.binarySearch(byteArray, 0, 3, searchKey);

		System.out.println(
				"indexOfSearchKey " + searchKey + " is =  " + indexOfSearchKey);
	}

}
