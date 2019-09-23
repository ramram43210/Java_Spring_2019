import java.util.Arrays;

public class ArraysDemo
{
	public static void main(String[] args)
	{

		String[] stringArray = new String[] { "Pineapple", "Apple", "Orange",
				"Banana" };

		System.out.println("Before sort = " + Arrays.toString(stringArray));

		Arrays.sort(stringArray);

		System.out.println("After Sort  = " + Arrays.toString(stringArray));
	}

}
