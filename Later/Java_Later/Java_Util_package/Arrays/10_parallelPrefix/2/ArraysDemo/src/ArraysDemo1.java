import java.util.Arrays;
import java.util.function.LongBinaryOperator;

/**
 * 
 * public static void parallelPrefix(long[] array, LongBinaryOperator
 * 																op)
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
	static long compute(long x, long y)
	{
		return x + y;
	}

	public static void main(String[] args)
	{
		long[] longArray = { 10, 20, 30, 40 };

		LongBinaryOperator longBinaryOperator = (x, y) -> compute(x, y);

		Arrays.parallelPrefix(longArray, longBinaryOperator);

		Arrays.stream(longArray).forEach(e -> System.out.print(e + "   "));
	}

}
