import java.util.Locale;

public class LocaleDemo
{

	public static void main(String[] args)
	{
		Locale locale = new Locale("en", "US");

		String displayCountryName = locale.getDisplayCountry();
		System.out.println("displayCountryName = " + displayCountryName);

		Locale frLocale = new Locale("fr", "FR");

		/*
		 * Parameters:
		 * 
		 * inLocale - The locale for which to retrieve the display
		 * country.
		 * 
		 * Returns:
		 * 
		 * The name of the country appropriate to the given locale.
		 */
		displayCountryName = locale.getDisplayCountry(frLocale);
		System.out.println("displayCountryName = " + displayCountryName);

	}

}
