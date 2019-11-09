import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{

		Integer[] integerArray1 = new Integer[] { 2, 4, 6 };

		System.out.println("integerArray1 = " + Arrays.toString(integerArray1));

		Integer[] integerArray2 = Arrays.copyOf(integerArray1, 2);

		System.out.println("integerArray2 = " + Arrays.toString(integerArray2));

	}

}
