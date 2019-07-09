import java.util.Locale;

/**
 * 
 * Display the country name in own country’s languages.
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

			System.out.println("Country Code = " + obj.getCountry()
					+ ", Country Name = " + obj.getDisplayCountry());

		}

	}

}
