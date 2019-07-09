import java.util.Arrays;
import java.util.function.DoubleBinaryOperator;

/**
 * 
 * public static void parallelPrefix(double[] array, int fromIndex,
 * 									int toIndex, DoubleBinaryOperator op)
 * 
 * Performs parallelPrefix(double[], DoubleBinaryOperator) for the
 * given subrange of the array.
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
	static double compute(double x, double y)
	{
		return x + y;
	}

	public static void main(String[] args)
	{
		double[] doubleArray = { 10.11, 20.11, 30.11, 40.11 };

		DoubleBinaryOperator doubleBinaryOperator = (x, y) -> compute(x, y);

		Arrays.parallelPrefix(doubleArray, 0, 3, doubleBinaryOperator);

		Arrays.stream(doubleArray).forEach(e -> System.out.print(e + "   "));
	}

}
