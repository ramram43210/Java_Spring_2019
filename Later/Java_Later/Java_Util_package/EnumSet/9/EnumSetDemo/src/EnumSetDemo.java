import java.util.EnumSet;

/**
 * 
 * public static <E extends Enum<E>> EnumSet<E> allOf(Class<E>
 * elementType)
 * 
 * Creates an enum set containing all of the elements in the specified
 * element type.
 * 
 * Type Parameters:
 * 
 * E - The class of the elements in the set
 * 
 * Parameters:
 * 
 * elementType - the class object of the element type for this enum
 * set
 * 
 * Returns:
 * 
 * An enum set containing all the elements in the specified type.
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
		 * Returns: An enum set containing all the elements in the
		 * specified type.
		 */
		EnumSet<Month> enumSet = EnumSet.allOf(Month.class);
		System.out.println("enumSet = " + enumSet);
	}

}
