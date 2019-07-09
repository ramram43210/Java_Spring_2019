import java.util.Random;

public class RandomDemo3
{

	public static void main(String[] args)
	{
	
		Random random = new Random();

		int i = 0;
		while (i < 5)
		{
			/*
			 * Returns:
			 * 
			 * the next pseudorandom, uniformly distributed double
			 * value between 0.0 and 1.0 from this random number
			 * generator's sequence
			 */
			double doubleValue = random.nextDouble();
			System.out.println("doubleValue =  " + doubleValue);
			++i;
		}

	}

}
