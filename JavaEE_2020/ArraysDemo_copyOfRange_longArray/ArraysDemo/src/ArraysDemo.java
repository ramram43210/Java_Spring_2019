import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{

		long[] longArray1 = new long[] { 5, 10, 15, 20, 25 };
		System.out.println("longArray1 = " + Arrays.toString(longArray1));

		long[] longArray2 = Arrays.copyOfRange(longArray1, 0, 3);
		System.out.println("longArray2 = " + Arrays.toString(longArray2));

	}

}
