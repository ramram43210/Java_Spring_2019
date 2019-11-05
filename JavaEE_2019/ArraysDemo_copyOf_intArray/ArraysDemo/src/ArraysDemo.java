import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{

		int[] intArray1 = new int[] { 3, 5, 2, 4 };

		System.out.println("intArray1 = " + Arrays.toString(intArray1));

		int[] intArray2 = Arrays.copyOf(intArray1, 3);

		System.out.println("intArray2 = " + Arrays.toString(intArray2));

	}

}
