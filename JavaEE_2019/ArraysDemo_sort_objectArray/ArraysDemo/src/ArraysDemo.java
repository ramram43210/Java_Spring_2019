import java.util.Arrays;

public class ArraysDemo
{
	public static void main(String[] args)
	{
		Object[] objectArray = { new Integer(5), new Integer(2), new Integer(7),
				new Integer(3), new Integer(1) };

		Arrays.sort(objectArray);

		System.out.println("The sorted Object array is:");
		int i = 0;
		for (Object integerValue : objectArray)
		{
			System.out.println(
					"Index = " + i + ", integerValue = " + integerValue);
			++i;
		}
	}
}
