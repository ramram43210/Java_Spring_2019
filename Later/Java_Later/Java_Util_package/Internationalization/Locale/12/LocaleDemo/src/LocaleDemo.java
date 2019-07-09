import java.util.Locale;

/**
 * 
 * Get a list of countries, and display the country name in FRENCH.
 *
 */
public class LocaleDemo
{

	public static void main(String[] args)
	{

		String[] locales = Locale.getISOCountries();

		for (String countryCode : locales)
		{

			Locale obj = new Locale("", countryCode);

			System.out.println(
					"Country Code = " + obj.getCountry() + ", Country Name = "
							+ obj.getDisplayCountry(Locale.FRENCH));

		}

	}

}
