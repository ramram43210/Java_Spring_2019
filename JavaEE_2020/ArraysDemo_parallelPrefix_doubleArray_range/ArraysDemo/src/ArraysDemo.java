import java.util.Arrays;
import java.util.function.DoubleBinaryOperator;

public class ArraysDemo
{
	// Performs addition
	static double compute(double x, double y)
	{
		double sum = x + y;
		return sum;
	}

	public static void main(String[] args)
	{
		double[] doubleArray = { 10.1, 20.1, 30.1, 2.1, 1.0 };

		DoubleBinaryOperator doubleBinaryOperator = (x, y) -> compute(x, y);

		Arrays.parallelPrefix(doubleArray, 0, 3, doubleBinaryOperator);

		Arrays.stream(doubleArray).forEach(e -> System.out.print(e + "   "));
	}

}
