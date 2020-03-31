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
		displayCurrency(Locale.UK);
	}

	static void displayCurrency(Locale locale)
	{
		double dbl = 2000.909;
		/*
		 * Returns:
		 * 
		 * the NumberFormat instance for currency formatting
		 */
		NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
		String currency = numberFormat.format(dbl);
		System.out.println(currency + " for the locale " + locale);
	}

}
