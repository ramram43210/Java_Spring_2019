import java.util.Arrays;

public class ArraysDemo
{
	public static void main(String[] args)
	{

		byte[] byteArray = { 5, 2, 7, 3, 9, 1, 0 };

		Arrays.sort(byteArray, 2, 6);

		System.out.println("The sorted int array is:");
		int i = 0;
		for (byte number : byteArray)
		{
			System.out.println("Index = " + i + ", Number = " + number);
			++i;
		}
	}

}
