import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{

		Integer[] integerArray1 = new Integer[] { 2, 4, 6 };

		System.out.println("integerArray1 = " + Arrays.toString(integerArray1));

		Number[] numberArray = Arrays.copyOf(integerArray1, 2, Number[].class);

		System.out.println("numberArray   = " + Arrays.toString(numberArray));

	}

}
