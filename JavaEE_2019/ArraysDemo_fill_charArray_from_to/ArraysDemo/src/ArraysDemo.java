import java.util.Arrays;

public class ArraysDemo
{
	public static void main(String[] args)
	{
		char[] charArray = new char[] { 'a', 'b', 'c', 'd', 'e' };

		System.out.println("Before fill = " + Arrays.toString(charArray));

		Arrays.fill(charArray, 0, 4, 'z');

		System.out.println("After fill  = " + Arrays.toString(charArray));
	}

}
