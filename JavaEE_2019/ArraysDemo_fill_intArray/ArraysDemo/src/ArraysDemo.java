import java.util.Arrays;

public class ArraysDemo
{
	public static void main(String[] args)
	{
		int[] intArray = new int[] { 2, 7, 9, 7, 1 };

		System.out.println("Before fill = " + Arrays.toString(intArray));

		Arrays.fill(intArray, 8);

		System.out.println("After fill  = " + Arrays.toString(intArray));
	}

}
