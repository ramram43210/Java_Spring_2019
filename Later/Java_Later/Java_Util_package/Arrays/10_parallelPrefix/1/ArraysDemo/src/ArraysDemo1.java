import java.util.Arrays;
import java.util.function.IntBinaryOperator;

/**
 * 
 * public static void parallelPrefix(int[] array, IntBinaryOperator
 * 																	op)
 * 
 * Cumulates, in parallel, each element of the given array in place,
 * using the supplied function. For example if the array initially
 * holds [2, 1, 0, 3] and the operation performs addition, then upon
 * return the array holds [2, 3, 3, 6]. Parallel prefix computation is
 * usually more efficient than sequential loops for large arrays.
 * 
 * Parameters:
 * 
 * array - the array, which is modified in-place by this method
 * 
 * op - a side-effect-free, associative function to perform the
 * cumulation
 */

public class ArraysDemo1
{
	// Performs addition
	static int compute(int x, int y)
	{
		return x + y;
	}

	public static void main(String[] args)
	{
		int[] intArray = { 10, 20, 30, 40 };

		IntBinaryOperator intBinaryOperator = (x, y) -> compute(x, y);

		Arrays.parallelPrefix(intArray, intBinaryOperator);

		Arrays.stream(intArray).forEach(e -> System.out.print(e + "   "));
	}

}
