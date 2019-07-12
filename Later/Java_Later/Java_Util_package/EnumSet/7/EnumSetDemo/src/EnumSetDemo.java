import java.util.EnumSet;

/**
 * 
 * public static <E extends Enum<E>> EnumSet<E> of(E first, E... rest)
 * 
 * Creates an enum set initially containing the specified elements.
 * This factory, whose parameter list uses the varargs feature, may be
 * used to create an enum set initially containing an arbitrary number
 * of elements, but it is likely to run slower than the overloadings
 * that do not use varargs.
 * 
 * Type Parameters:
 * 
 * E - The class of the specified element and of the set
 * 
 * Parameters:
 * 
 * first - an element that the set is to contain initially
 * 
 * rest - the remaining elements the set is to contain initially
 * 
 * Returns:
 * 
 * an enum set initially containing the specified elements
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
		// create a fake list that will be used like args
		Month[] monthList = { Month.FEB, Month.MAR, Month.APR,
				Month.MAY };
		createEnumSet(monthList);
	}

	public static void createEnumSet(Month[] varargs)
	{
		/*
		 * Returns: an enum set initially containing the specified
		 * elements
		 */
		EnumSet<Month> enumSet = EnumSet.of(Month.JAN, varargs);
		System.out.println("enumSet = " + enumSet);
	}
}
