import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{
		long[] longArray1 = new long[] { 1, 2, 3, 4 };
		long[] longArray2 = new long[] { 1, 2, 3, 4 };
		long[] longArray3 = new long[] { 10, 11, 12, 13 };
		
		boolean isEqual = Arrays.equals(longArray1, longArray2);
		System.out.println("is longArray1 equal to longArray2? =  " + isEqual);

		isEqual = Arrays.equals(longArray1, longArray3);
		System.out.println("is longArray1 equal to longArray3? =  " + isEqual);

	}

}
