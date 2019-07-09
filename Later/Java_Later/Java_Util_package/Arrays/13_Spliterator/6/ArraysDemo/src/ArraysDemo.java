import java.util.Arrays;
import java.util.Spliterator;

/**
 *
 * public static <T> Spliterator<T> spliterator(T[] array, int
 * startInclusive, int endExclusive)
 *
 * Returns a Spliterator covering the specified range of the specified
 * array.
 *
 */

public class ArraysDemo
{

	public static void main(String[] args)
	{
		String[] strArray = { "Apple", "banana", "Orange", "Grapes",
				"Mango" };

		/*
		 * Type Parameters:
		 * 
		 * T - type of elements
		 * 
		 * Parameters:
		 *
		 * array - the array, assumed to be unmodified during use
		 * 
		 * startInclusive - the first index to cover, inclusive
		 * 
		 * endExclusive - index immediately past the last index to
		 * cover
		 *
		 * Returns:
		 *
		 * a spliterator for the array elements
		 */
		Spliterator<String> s1 = Arrays.spliterator(strArray, 0, 3);

		/*
		 * Returns:a Spliterator covering some portion of the
		 * elements, or null if this spliterator cannot be split
		 */
		Spliterator<String> s2 = s1.trySplit();

		System.out.println("spliterator 1");
		s1.forEachRemaining(System.out::println);

		System.out.println("\nspliterator 2");
		s2.forEachRemaining(System.out::println);
	}

}
