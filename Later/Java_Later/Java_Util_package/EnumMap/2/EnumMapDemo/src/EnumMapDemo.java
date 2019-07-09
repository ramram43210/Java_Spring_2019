import java.util.EnumMap;

/**
 * public int size()
 * 
 * Returns the number of key-value mappings in this map
 * 
 * Returns:
 * 
 * the number of key-value mappings in this map
 * 
 */

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
		 * Returns the number of key-value mappings in this map.
		 */
		int size = enumMap.size();
		System.out.println("size = " + size);

	}

}
