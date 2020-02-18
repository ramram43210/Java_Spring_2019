import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{

		boolean[] booleanArray1 = new boolean[] { true, true, false,true,false };
		System.out.println("booleanArray1 = " + Arrays.toString(booleanArray1));

		boolean[] booleanArray2 = Arrays.copyOfRange(booleanArray1, 0, 3);
		System.out.println("booleanArray2 = " + Arrays.toString(booleanArray2));

	}

}
