import java.util.Random;

public class RandomDemo
{

	public static void main(String[] args)
	{
		Random random = new Random();

		int i = 0;
		while (i < 5)
		{
			/*
			 * Parameters:
			 * 
			 * bound - the upper bound (exclusive). Must be positive.
			 * 
			 * Returns:
			 * 
			 * the next pseudorandom, uniformly distributed int value
			 * between zero (inclusive) and bound (exclusive) from
			 * this random number generator's sequence
			 * 
			 */
			int intValue = random.nextInt(100);
			System.out.println("intValue =  " + intValue);
			++i;
		}

	}

}
