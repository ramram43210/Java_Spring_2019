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
			double[] doubleArray = { 10.11, 20.11, 30.11, 40.11 };

			DoubleBinaryOperator doubleBinaryOperator = (x, y) -> compute(x, y);

			Arrays.parallelPrefix(doubleArray, doubleBinaryOperator);

			Arrays.stream(doubleArray).forEach(e -> System.out.print(e + "   "));
		}

}
