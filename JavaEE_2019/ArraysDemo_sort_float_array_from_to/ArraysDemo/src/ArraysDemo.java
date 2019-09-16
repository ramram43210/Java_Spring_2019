import java.util.Arrays;

public class ArraysDemo
{
	public static void main(String[] args)
	{
		float[] floatArray = { 5.2f, 2.3f, 7.6f, 3.4f, 1.8f };
		
		Arrays.sort(floatArray, 0, 4);

		System.out.println("The sorted float array is:");
		int i = 0;
		for (float number : floatArray)
		{
			System.out.println("Index = " + i + ", Number = " + number);
			++i;
		}
	}

}
