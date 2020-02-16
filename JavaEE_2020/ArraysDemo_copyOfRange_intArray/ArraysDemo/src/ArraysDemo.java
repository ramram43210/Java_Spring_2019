import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{

		int[] intArray1 = new int[] { 5, 10, 15, 20, 25 };
		System.out.println("intArray1 = " + Arrays.toString(intArray1));

		int[] intArray2 = Arrays.copyOfRange(intArray1, 0, 3);
		System.out.println("intArray2 = " + Arrays.toString(intArray2));

	}

}
