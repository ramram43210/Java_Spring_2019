import java.util.Arrays;

public class ArraysDemo
{
	public static void main(String[] args)
	{
		Object[] objectArray = new Object[] { new Integer(2), new Integer(9),
				new Integer(7), new Integer(1) };

		System.out.println("Before fill = " + Arrays.toString(objectArray));

		Arrays.fill(objectArray, new Integer(8));

		System.out.println("After fill  = " + Arrays.toString(objectArray));
	}

}
