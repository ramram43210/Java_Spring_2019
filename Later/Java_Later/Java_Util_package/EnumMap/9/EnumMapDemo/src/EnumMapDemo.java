import java.util.EnumMap;

public class EnumMapDemo
{

	public enum Month
	{
		JAN, FEB, MAR, APR, MAY
	};

	public static void main(String[] args)
	{
		EnumMap<Month, String> enumMap = new EnumMap<Month, String>(
				Month.class);

		enumMap.put(Month.JAN, "January month is cool");
		enumMap.put(Month.FEB, "February month is cool");
		enumMap.put(Month.MAR, "March month is less hot");
		enumMap.put(Month.MAY, "May month is hot");

		System.out.println("Before remove, enumMap = " + enumMap);

		/*
		 * Removes the mapping for this key from this map if present.
		 * 
		 * Parameters:
		 * 
		 * key - the key whose mapping is to be removed from the map
		 * 
		 * Returns: the previous value associated with specified key,
		 * or null if there was no entry for key.
		 */
		String valueOfTheRemovedKey = enumMap.remove(Month.MAR);
		System.out.println("After remove, enumMap = " + enumMap);
		System.out.println(
				"valueOfTheRemovedKey = " + valueOfTheRemovedKey);

	}

}
