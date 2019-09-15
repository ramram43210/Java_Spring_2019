import java.util.Arrays;

public class ArraysDemo
{
	public static void main(String[] args)
	{
		long[] longArray = { 5, 3, 2, 0, 1 };

		Arrays.sort(longArray, 0, 3);

		System.out.println("The sorted long array is:");
		int i = 0;
		for (long number : longArray)
		{
			System.out.println("Index = " + i + ", Number = " + number);
			++i;
		}
	}
}
