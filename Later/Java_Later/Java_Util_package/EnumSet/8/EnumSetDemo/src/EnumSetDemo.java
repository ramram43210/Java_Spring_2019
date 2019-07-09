import java.util.EnumSet;

/**
 * 
 * public static <E extends Enum<E>> EnumSet<E> range(E from, E to)
 * 
 * Creates an enum set initially containing all of the elements in the
 * range defined by the two specified endpoints.
 * 
 * Type Parameters:
 * 
 * E - The class of the parameter elements and of the set
 * 
 * Parameters:
 * 
 * from - the first element in the range
 * 
 * to - the last element in the range
 * 
 * Returns:
 * 
 * an enum set initially containing all of the elements in the range
 * defined by the two specified endpoints
 *
 */

public class EnumSetDemo
{

	public enum Month
	{
		JAN, FEB, MAR, APR, MAY
	};

	public static void main(String[] args)
	{
		/*
		 * Returns: an enum set initially containing all of the
		 * elements in the range defined by the two specified
		 * endpoints
		 */
		EnumSet<Month> enumSet = EnumSet.range(Month.JAN, Month.APR);
		System.out.println("enumSet = " + enumSet);
	}

}
