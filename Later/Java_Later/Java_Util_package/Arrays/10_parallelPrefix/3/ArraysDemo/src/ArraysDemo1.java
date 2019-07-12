import java.util.Arrays;
import java.util.function.DoubleBinaryOperator;

/**
 * 
 * public static void parallelPrefix(double[] array,
 * DoubleBinaryOperator op)
 * 
 * Cumulates, in parallel, each element of the given array in place,
 * using the supplied function. For example if the array initially
 * holds [2.0, 1.0, 0.0, 3.0] and the operation performs addition,
 * then upon return the array holds [2.0, 3.0, 3.0, 6.0]. Parallel
 * prefix computation is usually more efficient than sequential loops
 * for large arrays.
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
	static double compute(double x, double y)
	{
		return x + y;
	}

	public static void main(String[] args)
	{
		double[] doubleArray = { 10.11, 20.11, 30.11, 40.11 };

		DoubleBinaryOperator doubleBinaryOperator = (x, y) -> compute(x, y);

		Arrays.parallelPrefix(doubleArray, doubleBinaryOperator);

		Arrays.stream(doubleArray).forEach(e -> System.out.print(e + "   "));
	}

}
