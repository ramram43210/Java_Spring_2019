import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{

		char[] charArray1 = new char[] { 'a', 'b', 'c', 'd' };
		char[] charArray2 = new char[] { 'a', 'b', 'c', 'd' };
		char[] charArray3 = new char[] { 'e', 'f', 'g', 'h' };

		boolean isEqual = Arrays.equals(charArray1, charArray2);
		System.out.println("is charArray1 equal to charArray2? =  " + isEqual);

		isEqual = Arrays.equals(charArray1, charArray3);
		System.out.println("is charArray1 equal to charArray3? =  " + isEqual);

	}

}
