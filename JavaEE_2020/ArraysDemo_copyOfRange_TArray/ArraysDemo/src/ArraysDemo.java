import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{

		Integer[] integerArray1 = new Integer[] { 5, 10, 15, 6, 7 };
		System.out.println("integerArray1 = " + Arrays.toString(integerArray1));

		Integer[] integerArray2 = Arrays.copyOfRange(integerArray1, 0, 3);
		System.out.println("integerArray2 = " + Arrays.toString(integerArray2));

	}

}
