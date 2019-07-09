import java.util.Arrays;

public class ArraysDemo1
{

	public static void main(String[] args)
	{

		char[] charArray = { 'a', 'c', 'g', 'z', 'd' };

		Arrays.sort(charArray);

		System.out.println("The sorted char array is:");
		int i = 0;
		for (char ch : charArray)
		{
			System.out.println("Index = " + i + ", char = " + ch);
			++i;
		}

		/*
		 * Searches the specified array of chars for the specified
		 * value using the binary search algorithm.
		 * 
		 * The array must be sorted (as by the sort(char[]) method)
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
		char searchKey = 'g';
		int indexOfSearchKey = Arrays.binarySearch(charArray, searchKey);

		System.out.println(
				"indexOfSearchKey " + searchKey + " is =  " + indexOfSearchKey);
	}

}
