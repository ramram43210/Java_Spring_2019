import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{

		Integer[] IntegerArray1 = new Integer[] { 1, 2, 3 };
		Integer[] IntegerArray2 = new Integer[] { 1, 2, 3 };
		Integer[] IntegerArray3 = new Integer[] { 4, 5, 6 };

		boolean isEqual = Arrays.equals(IntegerArray1, IntegerArray2);
		System.out.println("is IntegerArray1 equal to IntegerArray2? =  " + isEqual);

		isEqual = Arrays.equals(IntegerArray1, IntegerArray3);
		System.out.println("is IntegerArray1 equal to IntegerArray3? =  " + isEqual);

	}

}
