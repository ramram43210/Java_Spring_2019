import java.util.Arrays;

public class ArraysDemo
{
	public static void main(String[] args)
	{
		char[] charArray = { 'd', 'b', 'e', 'a', 'c' };
		Arrays.sort(charArray);

		System.out.println("The sorted char array is:");
		int i = 0;
		for (char ch : charArray)
		{
			System.out.println("Index = " + i + ", char = " + ch);
			++i;
		}
	}
}
