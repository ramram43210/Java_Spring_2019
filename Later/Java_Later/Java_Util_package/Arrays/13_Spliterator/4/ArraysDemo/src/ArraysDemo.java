import java.util.Arrays;
import java.util.Spliterator;

/**
 * 
 * public static Spliterator.OfInt spliterator(int[] array, int
 * 											startInclusive, int endExclusive)
 * 
 * Returns a Spliterator.OfDouble covering all of the specified array.
 *
 */

public class ArraysDemo
{

	public static void main(String[] args)
	{
		double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6 };

		/*
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
		Spliterator<Double> s1 = Arrays.spliterator(doubleArray, 0, 3);

		/*
		 * Returns:
		 * 
		 * a Spliterator covering some portion of the elements, or
		 * null if this spliterator cannot be split
		 */
		Spliterator<Double> s2 = s1.trySplit();

		System.out.println("spliterator 1");
		s1.forEachRemaining(System.out::println);

		System.out.println("\nspliterator 2");
		s2.forEachRemaining(System.out::println);
	}

}
