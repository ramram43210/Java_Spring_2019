import java.util.Arrays;
import java.util.Spliterator;

/**
 *
 * public static <T> Spliterator<T> spliterator(T[] array)
 *
 * Returns a Spliterator covering all of the specified array.
 *
 */

public class ArraysDemo
{

	public static void main(String[] args)
	{
		String[] strArray = { "Apple", "banana", "Orange" };

		/*
		 * Type Parameters:
		 * 
		 * T - type of elements
		 * 
		 * Parameters:
		 *
		 * array - the array, assumed to be unmodified during use
		 *
		 * Returns:
		 *
		 * a spliterator for the array elements
		 */
		Spliterator<String> s1 = Arrays.spliterator(strArray);

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
