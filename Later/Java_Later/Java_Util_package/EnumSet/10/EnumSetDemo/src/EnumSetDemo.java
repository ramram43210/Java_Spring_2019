import java.util.EnumSet;

/**
 * 
 * public static <E extends Enum<E>> EnumSet<E>
 * 									complementOf(EnumSet<E> s)
 * 
 * Creates an enum set with the same element type as the specified
 * enum set, initially containing all the elements of this type that
 * are not contained in the specified set.
 * 
 * Type Parameters: E - The class of the elements in the enum set
 * 
 * Parameters:
 * 
 * s - the enum set from whose complement to initialize this enum set
 * 
 * Returns:
 * 
 * The complement of the specified set in this set
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
		EnumSet<Month> enumSet1 = EnumSet.of(Month.JAN);
		System.out.println("enumSet1 = " + enumSet1);

		/*
		 * Create a enumSet2 which has all elements that enumSet1
		 * doesn't have
		 */
		EnumSet<Month> enumSet2 = EnumSet.complementOf(enumSet1);
		System.out.println("enumSet2 = " + enumSet2);
	}

}
