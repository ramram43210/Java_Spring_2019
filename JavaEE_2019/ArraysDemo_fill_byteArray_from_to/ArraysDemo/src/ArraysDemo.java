import java.util.Arrays;

public class ArraysDemo
{
	public static void main(String[] args)
	{
		byte[] byteArray = new byte[] { 2, 7, 9, 7, 1 };

		System.out.println("Before fill = " + Arrays.toString(byteArray));

		Arrays.fill(byteArray, 0, 4, (byte) 8);

		System.out.println("After fill  = " + Arrays.toString(byteArray));
	}

}
