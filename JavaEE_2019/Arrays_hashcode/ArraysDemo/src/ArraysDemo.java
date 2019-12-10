import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{
		int[] intArray = new int[] { 1, 15 };
		int hashCodeValue = Arrays.hashCode(intArray);
		System.out.println("intArray hashCodeValue = " + hashCodeValue);
	}

}
