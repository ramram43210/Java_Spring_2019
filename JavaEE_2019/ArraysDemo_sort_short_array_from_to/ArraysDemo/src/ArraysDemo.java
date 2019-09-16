import java.util.Arrays;

public class ArraysDemo
{
	public static void main(String[] args)
	{
		short[] shortArray = { 5, 7, 9, 3, 2, 1, 0 };

		Arrays.sort(shortArray, 2, 6);

		System.out.println("The sorted int array is:");
		int i = 0;
		for (short number : shortArray)
		{
			System.out.println("Index = " + i + ", Number = " + number);
			++i;
		}
	}
}
