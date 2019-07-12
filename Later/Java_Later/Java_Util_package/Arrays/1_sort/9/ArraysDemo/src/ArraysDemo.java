import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArraysDemo
{

	public static void main(String[] args)
	{

		Integer[] integerArray = new Integer[] { 3, 1, 4, 2 };
		System.out.println("Before Sort= " + Arrays.toString(integerArray));

		Comparator<Integer> comp = Collections.reverseOrder();

		/*
		 * public static <T> void sort(T[] a, Comparator<? super T> c)
		 * 
		 * Sorts the specified array of objects according to the order
		 * induced by the specified comparator.
		 * 
		 * Type Parameters:
		 * 
		 * T - the class of the objects to be sorted
		 * 
		 * Parameters:
		 * 
		 * a - the array to be sorted
		 * 
		 * c - the comparator to determine the order of the array. A
		 * null value indicates that the elements' natural ordering
		 * should be used.
		 * 
		 */
		Arrays.sort(integerArray, comp);
		System.out.println("After Sort = " + Arrays.toString(integerArray));
	}

}
