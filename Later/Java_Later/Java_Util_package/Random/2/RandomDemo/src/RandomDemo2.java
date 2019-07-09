import java.util.Random;

public class RandomDemo2
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
			 * the next pseudorandom, uniformly distributed float
			 * value between 0.0 and 1.0 from this random number
			 * generator's sequence
			 */
			Float floatValue = random.nextFloat();
			System.out.println("floatValue" + floatValue);
			++i;
		}

	}

}
