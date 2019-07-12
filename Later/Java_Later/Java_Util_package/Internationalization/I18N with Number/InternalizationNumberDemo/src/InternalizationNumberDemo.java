import java.text.NumberFormat;
import java.util.Locale;

/**
 * 
 * Internationalizing Number (I18N with Number)
 *
 */
public class InternalizationNumberDemo
{

	public static void main(String[] args)
	{
		displayNumber(Locale.US);
		displayNumber(Locale.CHINA);
		displayNumber(Locale.FRANCE);
	}

	static void displayNumber(Locale locale)
	{
		double dbl = 10000.909;
		/*
		 * Returns a general-purpose number format for the specified
		 * locale.
		 * 
		 * Parameters:
		 * 
		 * inLocale - the desired locale
		 * 
		 * Returns: the NumberFormat instance for general-purpose
		 * number formatting
		 */
		NumberFormat formatter = NumberFormat.getNumberInstance(locale);
		String number = formatter.format(dbl);
		System.out.println(number + " for the locale " + locale);
	}

}
