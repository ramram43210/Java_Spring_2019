import java.util.Arrays;
import java.util.function.BinaryOperator;

/**
 *
 * public static void parallelPrefix(double[] array, int fromIndex,
 * int toIndex, DoubleBinaryOperator op)
 *
 * Performs parallelPrefix(Object[], BinaryOperator) for the given
 * subrange of the array.
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
	static Integer compute(Object x, Object y)
	{
		return (Integer) x + (Integer) y;
	}

	public static void main(String[] args)
	{
		Integer[] dousableArray = { 10, 20, 30, 40, 50 };

		BinaryOperator binaryOperator = (x, y) -> compute(x, y);

		Arrays.parallelPrefix(doubleArray, 0, 3, binaryOperator);

		Arrays.stream(doubleArray).forEach(e -> System.out.print(e + "   "));
	}

}
