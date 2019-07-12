import java.util.Locale;

public class LocaleDemo1
{

	public static void main(String[] args)
	{
		Locale locale = new Locale("en", "US", "WIN");

		String displayVariant = locale.getDisplayVariant();
		System.out.println("Display Variant = " + displayVariant);

		Locale frLocale = new Locale("fr", "FR");

		/*
		 * Parameters:
		 * 
		 * inLocale - The locale for which to retrieve the display
		 * variant code.
		 * 
		 * Returns:
		 * 
		 * The name of the display variant code appropriate to the
		 * given locale.
		 * 
		 */
		displayVariant = locale.getDisplayVariant(frLocale);
		System.out.println("Display Variant = " + displayVariant);

	}

}
