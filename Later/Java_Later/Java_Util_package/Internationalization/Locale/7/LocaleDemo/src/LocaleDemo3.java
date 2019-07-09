import java.util.Locale;

public class LocaleDemo3
{

	public static void main(String[] args)
	{
		Locale locale = new Locale("en", "US");

		String displayName = locale.getDisplayName();
		System.out.println("Display Name = " + displayName);

		Locale frLocale = new Locale("fr", "FR");

		/*
		 * Parameters:
		 * 
		 * inLocale - The locale for which to retrieve the display
		 * name.
		 * 
		 * Returns:
		 * 
		 * The name of the locale appropriate to display.
		 * 
		 * 
		 */
		displayName = locale.getDisplayName(frLocale);
		System.out.println("Display Name = " + displayName);

	}

}
