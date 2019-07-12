import java.util.ArrayList;
import java.util.EnumSet;

/**
 * 
 * public static <E extends Enum<E>> EnumSet<E> copyOf(Collection<E>
 *                                                                 c)
 * 
 * Creates an enum set initialized from the specified collection.
 * 
 * Type Parameters:
 * 
 * E - The class of the elements in the collection
 * 
 * Parameters:
 * 
 * c - the collection from which to initialize this enum set
 * 
 * Returns:
 * 
 * An enum set initialized from the given collection.
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

		ArrayList<Month> list = new ArrayList<Month>();
		list.add(Month.JAN);
		list.add(Month.FEB);
		list.add(Month.MAR);

		/*
		 * Returns:An enum set initialized from the given collection.
		 */
		EnumSet<Month> enumSet = EnumSet.copyOf(list);
		System.out.println("enumSet = " + enumSet);
	}

}
