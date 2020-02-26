import java.util.Arrays;
import java.util.function.LongBinaryOperator;

public class ArraysDemo
{
	// Performs multiplication
	static long compute(long x, long y)
	{
		long result = x * y;
		return result;
	}

	public static void main(String[] args)
	{
		long[] longArray = { 10, 20, 30, 40 };

		LongBinaryOperator longBinaryOperator = (x, y) -> compute(x, y);

		Arrays.parallelPrefix(longArray, longBinaryOperator);

		Arrays.stream(longArray).forEach(e -> System.out.print(e + "   "));
	}

}
