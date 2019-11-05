import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{

		long[] longArray1 = new long[] { 3, 5, 2, 4 };

		System.out.println("longArray1 = " + Arrays.toString(longArray1));

		long[] longArray2 = Arrays.copyOf(longArray1, 3);

		System.out.println("longArray2 = " + Arrays.toString(longArray2));

	}

}
