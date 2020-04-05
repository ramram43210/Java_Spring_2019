import java.util.Locale;

public class LocaleDemo
{

	public static void main(String[] args)
	{
		/*
		 * Useful constant for country.
		 */
		Locale usLocale = Locale.US;
		System.out.println(usLocale);

		Locale frenchLocale = Locale.FRENCH;
		System.out.println(frenchLocale);

		Locale chineseLocale = Locale.CHINESE;
		System.out.println(chineseLocale);
	}

}
