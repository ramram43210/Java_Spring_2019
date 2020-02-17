import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{
		Integer[] integerArray = new Integer[5];
		System.out.println("before SetAll = "+Arrays.toString(integerArray));
	
		Arrays.setAll(integerArray, (index) -> index + 10);
		System.out.println("After SetAll  = "+Arrays.toString(integerArray));
	}

}
