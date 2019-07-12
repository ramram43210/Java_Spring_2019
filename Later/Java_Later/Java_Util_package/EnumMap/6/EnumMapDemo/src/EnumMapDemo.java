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
		 * key - the key whose associated value is to be returned
		 * 
		 * Returns: the value to which the specified key is mapped, or
		 * null if this map contains no mapping for the key
		 */
		String value = enumMap.get(Month.JAN);
		System.out.println("value = " + value);

	}

}
