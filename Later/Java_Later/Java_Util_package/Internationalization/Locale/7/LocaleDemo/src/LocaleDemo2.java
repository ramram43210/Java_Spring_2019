import java.util.Locale;

public class LocaleDemo2
{

	public static void main(String[] args)
	{
		Locale locale = new Locale("en", "US");

		String displayName = locale.getDisplayLanguage();
		System.out.println("Display Language = " + displayName);

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
		displayName = locale.getDisplayLanguage(frLocale);
		System.out.println("Display Language = " + displayName);

	}

}
