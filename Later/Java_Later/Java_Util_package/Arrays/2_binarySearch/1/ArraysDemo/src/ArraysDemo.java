import java.util.Arrays;
import java.util.List;

public class ArraysDemo
{

	public static void main(String[] args)
	{

		String[] nameArray = new String[] { "Ram", "Peter", "Dave" };

		/*
		 * Returns a fixed-size list backed by the specified array.
		 * (Changes to the returned list "write through" to the
		 * array.)
		 * 
		 * Parameters:
		 * 
		 * a - the array by which the list will be backed
		 * 
		 * Returns:
		 * 
		 * a list view of the specified array
		 */
		List<String> nameList = Arrays.asList(nameArray);

		System.out.println(nameList);
	}

}
