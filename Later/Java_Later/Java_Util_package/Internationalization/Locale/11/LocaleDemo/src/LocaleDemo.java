import java.util.Locale;

public class LocaleDemo
{

	public static void main(String[] args)
	{

		/*
		 * Returns: An array of ISO 3166 two-letter country codes.
		 */
		String[] countryCodeArray = Locale.getISOCountries();

		for (String countryCode : countryCodeArray)
		{

			Locale obj = new Locale("", countryCode);

			System.out.println("Country Code = " + obj.getCountry()
					+ ", Country Name = " + obj.getDisplayCountry());

		}

	}

}
