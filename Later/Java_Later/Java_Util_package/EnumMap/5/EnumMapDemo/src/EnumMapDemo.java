import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

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
		 * Returns: a set view of the mappings contained in this
		 * enummap
		 */
		Set<Map.Entry<Month, String>> set = enumMap.entrySet();
		System.out.println("set = " + set);

	}

}
