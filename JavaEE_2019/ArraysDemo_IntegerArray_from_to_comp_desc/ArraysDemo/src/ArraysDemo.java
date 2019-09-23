import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArraysDemo
{
	public static void main(String[] args)
	{
		Integer[] integerArray = new Integer[] { 3, 1, 4, 2, 7, 0 };
		System.out.println("Before Sort= " + Arrays.toString(integerArray));

		/*
		 * Returns: A comparator that imposes the reverse of the
		 * natural ordering on a collection of objects that implement
		 * the Comparable interface.
		 */
		Comparator<Integer> reverseComparator = Collections.reverseOrder();

		Arrays.sort(integerArray, 0, 3, reverseComparator);
		System.out.println("After Sort = " + Arrays.toString(integerArray));
	}

}
