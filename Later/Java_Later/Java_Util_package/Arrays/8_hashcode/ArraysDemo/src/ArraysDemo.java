public class ArraysDemo
{

	public static void main(String[] args)
	{

		int[] intArray = new int[] { 1, 15 };

		/*
		 * Returns a hash code based on the contents of the specified
		 * array.
		 */
		int hashCodeValue = intArray.hashCode();
		System.out.println("intArray hashCodeValue = " + hashCodeValue);

		double[] doubleArray = new double[] { 90.1, 15.6 };
		hashCodeValue = doubleArray.hashCode();

		System.out.println("doubleArray hashCodeValue = " + hashCodeValue);

	}

}
