import java.util.Locale;

public class LocaleDemo2
{

	public static void main(String[] args)
	{
		/*
		 * Returns: 
		 * 
		 * An array of ISO 3166 two-letter country codes.
		 */
		String[] countryCodeArray = Locale.getISOCountries();

		for (String country : countryCodeArray)
		{
			System.out.println(country);
		}

	}

}
