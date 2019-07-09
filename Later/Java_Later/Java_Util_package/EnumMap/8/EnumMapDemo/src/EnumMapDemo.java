import java.util.EnumMap;

public class EnumMapDemo
{

	public enum Month
	{
		JAN, FEB, MAR, APR, MAY
	};

	public static void main(String[] args)
	{
		EnumMap<Month, String> enumMap1 = new EnumMap<Month, String>(
				Month.class);

		enumMap1.put(Month.JAN, "January month is cool");
		enumMap1.put(Month.FEB, "February month is cool");
		enumMap1.put(Month.MAR, "March month is less hot");
		enumMap1.put(Month.MAY, "May month is hot");

		System.out.println("enumMap1 = " + enumMap1);

		EnumMap<Month, String> enumMap2 = new EnumMap<Month, String>(
				Month.class);

		/*
		 * Copies all of the mappings from the specified map to this
		 * map. These mappings will replace any mappings that this map
		 * had for any of the keys currently in the specified map.
		 */
		enumMap2.putAll(enumMap1);
		System.out.println("\nenumMap2 = " + enumMap2);

	}

}
