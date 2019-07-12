import java.util.EnumSet;

/**
 * public static <E extends Enum<E>> EnumSet<E> noneOf(Class<E>
 * 														elementType)
 * 
 * Creates an empty enum set with the specified element type.
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
 * An empty enum set of the specified type.
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
		 * Returns: An empty enum set of the specified type.
		 */
		EnumSet<Month> enumSet = EnumSet.noneOf(Month.class);
		System.out.println("enumSet = " + enumSet);
	}

}
