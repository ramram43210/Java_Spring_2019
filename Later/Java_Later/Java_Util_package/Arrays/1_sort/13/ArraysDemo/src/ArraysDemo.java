import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{

		String[] fruits = new String[] { "Pineapple", "Apple", "Orange",
				"Banana" };
		System.out.println("Before sort = " + Arrays.toString(fruits));

		/*
		 * public static void sort(Object[] a)
		 * 
		 * Sorts the specified array of objects into ascending order,
		 * according to the natural ordering of its elements. All
		 * elements in the array must implement the Comparable
		 * interface.
		 * 
		 * Parameters:
		 * 
		 * a - the array to be sorted
		 */
		Arrays.sort(fruits);

		System.out.println("After Sort  = " + Arrays.toString(fruits));
	}

}
