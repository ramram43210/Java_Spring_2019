import java.util.Arrays;

public class ArraysDemo
{
	public static void main(String[] args)
	{
		int[] intArray = { 5, 2, 7, 3, 9 };

		Arrays.sort(intArray);

		System.out.println("The sorted int array is:");
		
		int i = 0;
		for (int number : intArray)
		{
			System.out.println("Index = " + i + ", Number = " + number);
			++i;
		}
	}
}
