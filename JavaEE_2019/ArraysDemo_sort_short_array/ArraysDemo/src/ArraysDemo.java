import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{

		short[] shortArray = { 5, 2, 7, 3, 9 };
		
		Arrays.sort(shortArray);

		System.out.println("The sorted short array is:");
		int i = 0;
		for (short number : shortArray)
		{
			System.out.println("Index = " + i + ", Number = " + number);
			++i;
		}

	}

}
