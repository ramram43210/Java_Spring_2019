import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{

		byte[] byteArray1 = new byte[] { 3, 5, 2, 4 };

		System.out.println("byteArray1 = " + Arrays.toString(byteArray1));

		byte[] byteArray2 = Arrays.copyOf(byteArray1, 3);

		System.out.println("byteArray2 = " + Arrays.toString(byteArray2));

	}

}
