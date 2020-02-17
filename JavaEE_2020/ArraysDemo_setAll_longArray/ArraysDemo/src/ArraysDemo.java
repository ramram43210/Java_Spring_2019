import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{
		long[] longArray = new long[5];
		System.out.println("before SetAll = "+Arrays.toString(longArray));
	
		Arrays.setAll(longArray, (index) -> index * 20);
		System.out.println("After SetAll  = "+Arrays.toString(longArray));
	}

}
