import java.util.Locale;

public class LocaleDemo1
{

	public static void main(String[] args)
	{

		/*
		 * Construct a locale from a language code. This constructor
		 * normalizes the language value to lowercase.
		 * 
		 * Parameters:
		 * 
		 * language - An ISO 639 alpha-2 or alpha-3 language code, or
		 * a language subtag up to 8 characters in length. See the
		 * Locale class description about valid language values.
		 * 
		 */
		Locale enLocale = new Locale("en");
		System.out.println(enLocale);

		Locale frLocale = new Locale("fr");
		System.out.println(frLocale);

	}

}
