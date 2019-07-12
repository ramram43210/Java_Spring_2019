import java.util.Arrays;
import java.util.function.IntBinaryOperator;

/**
 * 
 * public static void parallelPrefix(int[] array, int fromIndex, int
 * 											toIndex, IntBinaryOperator op)
 * 
 * Cumulates, in parallel, each element of the given array in place,
 * using the supplied function. For example if the array initially
 * holds [2, 1, 0, 3] and the operation performs addition, then upon
 * return the array holds [2, 3, 3, 6]. Parallel prefix computation is
 * usually more efficient than sequential loops for large arrays.
 * 
 * Parameters:
 *
 * array - the array
 *
 * fromIndex - the index of the first element, inclusive
 *
 * toIndex - the index of the last element, exclusive
 *
 * op - a side-effect-free, associative function to perform the
 * cumulation
 */
public class ArraysDemo2
{

	// Performs addition
	static int compute(int x, int y)
	{
		return x + y;
	}

	public static void main(String[] args)
	{
		int[] intArray = { 10, 20, 30, 40, 50 };

		IntBinaryOperator intBinaryOperator = (x, y) -> compute(x, y);

		Arrays.parallelPrefix(intArray, 0, 3, intBinaryOperator);

		Arrays.stream(intArray).forEach(e -> System.out.print(e + "   "));
	}

}
