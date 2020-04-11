import java.util.Locale;

public class LocaleDemo
{

	public static void main(String[] args)
	{
		Locale locale = new Locale("en", "US");

		String displayLanguage = locale.getDisplayLanguage();
		System.out.println("Display Language = " + displayLanguage);

		Locale frLocale = new Locale("fr", "FR");

		/*
		 * Parameters:
		 * 
		 * inLocale - The locale for which to retrieve the display
		 * language.
		 * 
		 * Returns:
		 * 
		 * The name of the display language appropriate to the given
		 * locale.
		 * 
		 */
		displayLanguage = locale.getDisplayLanguage(frLocale);
		System.out.println("Display Language = " + displayLanguage);

	}

}
