import java.text.NumberFormat;
import java.util.Locale;

/**
 * 
 * Internationalizing Currency (I18N with Currency)
 *
 */
public class InternalizationCurrencyDemo
{

	public static void main(String[] args)
	{
		displayCurrency(Locale.US);
		displayCurrency(Locale.CHINA);
		displayCurrency(Locale.FRANCE);
	}

	static void displayCurrency(Locale locale)
	{
		double dbl = 2000.909;
		/*
		 * Returns a currency format for the specified locale.
		 * 
		 * Parameters:
		 * 
		 * inLocale - the desired locale
		 * 
		 * Returns:
		 * 
		 * the NumberFormat instance for currency formatting
		 */
		NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);
		String currency = formatter.format(dbl);
		System.out.println(currency + " for the locale " + locale);
	}

}
