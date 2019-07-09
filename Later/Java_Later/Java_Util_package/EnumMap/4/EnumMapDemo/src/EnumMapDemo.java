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

		System.out.println("enumMap = " + enumMap);

		/*
		 * Parameters:
		 * 
		 * key - the key whose presence in this map is to be tested
		 * 
		 * Returns true if this map contains a mapping for the
		 * specified key.
		 */
		boolean isKeyExists = enumMap.containsKey(Month.MAY);
		System.out.println("isKeyExists = " + isKeyExists);

		/*
		 * Parameters:
		 * 
		 * value - the value whose presence in this map is to be
		 * tested
		 * 
		 * Returns true if this map maps one or more keys to the
		 * specified value.
		 */
		boolean isValueExists = enumMap
				.containsValue("March month is less hot");
		System.out.println("isValueExists = " + isValueExists);

	}

}
