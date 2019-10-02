import java.util.Arrays;
import java.util.List;

public class ArraysDemo
{

	public static void main(String[] args)
	{

		String[] strArray = new String[] { "Ram", "Peter", "Dave" };

		/*
		 * Returns:a list view of the specified array
		 */
		List<String> list = Arrays.asList(strArray);

		System.out.println(list);
	}

}
