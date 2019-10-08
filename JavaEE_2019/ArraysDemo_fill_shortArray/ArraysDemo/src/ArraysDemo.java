import java.util.Arrays;

public class ArraysDemo
{
	public static void main(String[] args)
	{
		short[] shortArray = new short[] { 2, 7, 9, 7, 1 };

		System.out.println("Before fill = " + Arrays.toString(shortArray));

		Arrays.fill(shortArray, (short) 8);

		System.out.println("After fill  = " + Arrays.toString(shortArray));
	}

}
