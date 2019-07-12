import java.util.Arrays;

public class ArraysDemo2
{

	public static void main(String[] args)
	{

		Object[] objArray = { 10, 5, 8, 90, 50, 40 };

		Arrays.sort(objArray);

		System.out.println("The sorted int array is:");
		int i = 0;
		for (Object number : objArray)
		{
			System.out.println("Index = " + i + ", Number = " + number);
			++i;
		}

		/*
		 * Searches a range of the specified array for the specified
		 * object using the binary search algorithm. The range must be
		 * sorted into ascending order according to the natural
		 * ordering of its elements (as by the sort(Object[], int,
		 * int) method) prior to making this call.
		 * 
		 * If it is not sorted, the results are undefined. (If the
		 * range contains elements that are not mutually comparable
		 * (for example, strings and integers), it cannot be sorted
		 * according to the natural ordering of its elements, hence
		 * results are undefined.) If the range contains multiple
		 * elements equal to the specified object, there is no
		 * guarantee which one will be found.
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
		Object searchKey = 8;
		int indexOfSearchKey = Arrays.binarySearch(objArray, 0, 3, searchKey);

		System.out.println(
				"indexOfSearchKey " + searchKey + " is =  " + indexOfSearchKey);
	}

}
