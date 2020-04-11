import java.util.Locale;

public class LocaleDemo
{

	public static void main(String[] args)
	{
		/*
		 * Returns:
		 * 
		 * An array of installed locales.
		 */

		Locale[] localeArray = Locale.getAvailableLocales();

		for (Locale locale : localeArray)
		{
			System.out.println(locale);
		}

	}

}
