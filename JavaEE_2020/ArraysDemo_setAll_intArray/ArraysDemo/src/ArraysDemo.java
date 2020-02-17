import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{
		int[] intArray = new int[5];
		System.out.println("before SetAll = "+Arrays.toString(intArray));
	
		Arrays.setAll(intArray, (index) -> index * 10);
		System.out.println("After SetAll  = "+Arrays.toString(intArray));
	}

}
