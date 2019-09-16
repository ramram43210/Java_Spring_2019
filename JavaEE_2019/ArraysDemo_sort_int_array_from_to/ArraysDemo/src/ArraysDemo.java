import java.util.Arrays;

public class ArraysDemo
{
	public static void main(String[] args)
	{
		int[] intArray = { 5, 3, 2, 9, 0 };

		Arrays.sort(intArray, 1, 4);

		System.out.println("The sorted int array is:");
		int i = 0;
		for (int number : intArray)
		{
			System.out.println("Index = " + i + ", Number = " + number);
			++i;
		}
	}

}
