import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{

		byte[] byteArray1 = new byte[] { 1, 2, 3, 4 };
		byte[] byteArray2 = new byte[] { 1, 2, 3, 4 };
		byte[] byteArray3 = new byte[] { 10, 11, 12, 13 };

		boolean isEqual = Arrays.equals(byteArray1, byteArray2);
		System.out.println("is byteArray1 equal to byteArray2? =  " + isEqual);

		isEqual = Arrays.equals(byteArray1, byteArray3);
		System.out.println("is byteArray1 equal to byteArray3? =  " + isEqual);

	}

}
