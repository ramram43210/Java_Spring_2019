import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{

		byte[] byteArray1 = new byte[] { 5, 10, 15, 20, 25 };
		System.out.println("byteArray1 = " + Arrays.toString(byteArray1));

		byte[] byteArray2 = Arrays.copyOfRange(byteArray1, 0, 3);
		System.out.println("byteArray2 = " + Arrays.toString(byteArray2));

	}

}
