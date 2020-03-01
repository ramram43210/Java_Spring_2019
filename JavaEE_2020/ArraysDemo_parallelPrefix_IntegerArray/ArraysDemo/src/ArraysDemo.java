import java.util.Arrays;
import java.util.function.BinaryOperator;

public class ArraysDemo
{
	// Performs addition
	static Integer compute(Object x, Object y)
	{
		Integer sum = (Integer) x + (Integer) y;
		return sum;
	}

	public static void main(String[] args)
	{
		Integer[] integerArray = { 10, 20, 30, 40, 50 };

		BinaryOperator<Integer> binaryOperator = (x, y) -> compute(x, y);

		Arrays.parallelPrefix(integerArray, binaryOperator);

		Arrays.stream(integerArray).forEach(e -> System.out.print(e + "   "));
	}

}
