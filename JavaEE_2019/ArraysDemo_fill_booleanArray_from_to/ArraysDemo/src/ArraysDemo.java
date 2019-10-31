import java.util.Arrays;

public class ArraysDemo
{
	public static void main(String[] args)
	{
		boolean[] booleanArray = new boolean[] { true, true, true, true, true };

		System.out.println("Before fill = " + Arrays.toString(booleanArray));

		Arrays.fill(booleanArray, 0, 4, false);

		System.out.println("After fill  = " + Arrays.toString(booleanArray));
	}

}
