import java.util.Arrays;
import java.util.Spliterator;

/**
 * 
 * public static Spliterator.OfDouble spliterator(double[] array)
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
		 * Returns:
		 * 
		 * a spliterator for the array elements
		 */
		Spliterator<Double> s1 = Arrays.spliterator(doubleArray);

		/*
		 * Returns:a Spliterator covering some portion of the
		 * elements, or null if this spliterator cannot be split
		 */
		Spliterator<Double> s2 = s1.trySplit();

		System.out.println("spliterator 1");
		s1.forEachRemaining(System.out::println);

		System.out.println("\nspliterator 2");
		s2.forEachRemaining(System.out::println);
	}

}
