import java.util.EnumSet;

/**
 *
 * public static <E extends Enum<E>> EnumSet<E> of(E e1, E e2, E e3)
 *
 * Creates an enum set initially containing the specified elements.
 *
 * Type Parameters:
 *
 * E - The class of the specified element and of the set
 *
 * Parameters:
 *
 * e1 - an element that this set is to contain initially
 *
 * e2 - another element that this set is to contain initially
 *
 * e3 - another element that this set is to contain initially
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
		/*
		 * Returns: an enum set initially containing the specified
		 * elements
		 */

		EnumSet<Month> enumSet = EnumSet.of(Month.MAR, Month.JAN,
				Month.MAY);
		System.out.println("enumSet = " + enumSet);
	}

}
