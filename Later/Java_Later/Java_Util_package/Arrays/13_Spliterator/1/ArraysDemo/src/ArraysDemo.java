import java.util.Arrays;
import java.util.Spliterator;

/**
 * 
 * public static Spliterator.OfInt spliterator(int[] array)
 * 
 * Returns a Spliterator.OfInt covering all of the specified array.
 *
 */

public class ArraysDemo
{

	public static void main(String[] args)
	{
		int[] intArray = { 1, 2, 3, 4, 5, 6 };

		/*
		 * Parameters:
		 * 
		 * array - the array, assumed to be unmodified during use
		 * 
		 * Returns:
		 * 
		 * a spliterator for the array elements
		 */
		Spliterator<Integer> s1 = Arrays.spliterator(intArray);

		/*
		 * Returns:a Spliterator covering some portion of the
		 * elements, or null if this spliterator cannot be split
		 */
		Spliterator<Integer> s2 = s1.trySplit();

		System.out.println("spliterator 1");
		s1.forEachRemaining(System.out::println);

		System.out.println("\nspliterator 2");
		s2.forEachRemaining(System.out::println);
	}

}
