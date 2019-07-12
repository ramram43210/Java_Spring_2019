import java.util.Locale;

public class LocaleDemo1
{

	public static void main(String[] args)
	{
		Locale locale = new Locale("en", "US");

		String displayName = locale.getDisplayCountry();
		System.out.println("Display Country = " + displayName);

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
		displayName = locale.getDisplayCountry(frLocale);
		System.out.println("Display Country = " + displayName);

	}

}
