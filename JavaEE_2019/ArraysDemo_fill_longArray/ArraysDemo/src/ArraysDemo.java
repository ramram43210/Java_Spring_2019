import java.util.Arrays;

public class ArraysDemo
{
	public static void main(String[] args)
	{
		long[] longArray = new long[] { 2, 7, 9, 7, 1 };

		System.out.println("Before fill = " + Arrays.toString(longArray));

		Arrays.fill(longArray, 8);

		System.out.println("After fill  = " + Arrays.toString(longArray));
	}

}
