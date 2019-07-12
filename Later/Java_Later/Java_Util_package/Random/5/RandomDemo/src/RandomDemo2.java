import java.util.Random;
import java.util.stream.DoubleStream;

public class RandomDemo2
{

	public static void main(String[] args)
	{
		Random random = new Random();

		/*
		 * Returns an effectively unlimited stream of pseudorandom
		 * double values, each between zero (inclusive) and one
		 * (exclusive).
		 */
		DoubleStream doubleStream = random.doubles();

		doubleStream.limit(5).forEach(System.out::println);

	}

}
