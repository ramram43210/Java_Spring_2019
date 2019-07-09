import java.util.ArrayList;
import java.util.EnumSet;

/**
 * 
 * public static <E extends Enum<E>> EnumSet<E> of(E e)
 * 
 * Creates an enum set initially containing the specified element.
 * 
 * Type Parameters:
 * 
 * E - The class of the specified element and of the set
 * 
 * Parameters:
 * 
 * e - the element that this set is to contain initially
 * 
 * Returns:
 * 
 * an enum set initially containing the specified element
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
		 * element
		 */

		EnumSet<Month> enumSet = EnumSet.of(Month.MAR);
		System.out.println("enumSet = " + enumSet);

		enumSet = EnumSet.of(Month.FEB);
		System.out.println("enumSet = " + enumSet);
	}

}
