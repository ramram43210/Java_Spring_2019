import java.text.DateFormat;
import java.util.Locale;

public class DateFormatDemo
{
	public static void main(String[] args)
	{
		/*
		 * Returns:
		 * 
		 * An array of locales for which localized DateFormat
		 * instances are available.
		 */
		Locale[] localeArray = DateFormat.getAvailableLocales();
		
		for (Locale locale : localeArray)
		{
			System.out.println(locale.getDisplayName());
		}

	}

}
