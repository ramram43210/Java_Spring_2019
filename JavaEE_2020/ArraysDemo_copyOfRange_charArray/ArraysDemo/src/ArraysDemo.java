import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{

		char[] charArray1 = new char[] { 'a', 'b', 'c', 'd', 'e' };
		System.out.println("charArray1 = " + Arrays.toString(charArray1));

		char[] charArray2 = Arrays.copyOfRange(charArray1, 0, 3);
		System.out.println("charArray2 = " + Arrays.toString(charArray2));

	}

}
