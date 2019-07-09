import java.util.Locale;

public class LocaleDemo2
{

	public static void main(String[] args)
	{

		/*
		 * Construct a locale from language and country. This
		 * constructor normalizes the language value to lowercase and
		 * the country value to uppercase.
		 * 
		 * Parameters:
		 * 
		 * language - An ISO 639 alpha-2 or alpha-3 language code, or
		 * a language subtag up to 8 characters in length. See the
		 * Locale class description about valid language values.
		 * 
		 * country - An ISO 3166 alpha-2 country code or a UN M.49
		 * numeric-3 area code. See the Locale class description about
		 * valid country values.
		 * 
		 */
		Locale enLocale = new Locale("en", "US");
		System.out.println(enLocale);

		Locale frLocale = new Locale("fr", "FR");
		System.out.println(frLocale);

	}

}
