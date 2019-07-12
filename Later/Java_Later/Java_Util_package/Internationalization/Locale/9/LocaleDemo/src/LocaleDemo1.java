import java.util.Locale;

public class LocaleDemo1
{

	public static void main(String[] args)
	{

		/*
		 * Creates Locale objects for the English language in the
		 * United States.
		 */
		Locale usLocale = new Locale.Builder().setLanguage("en").setRegion("US")
				.build();
		
		System.out.println(usLocale);

		/*
		 * Creates Locale objects for the English language in the
		 * Great Britain:
		 */
		Locale gbLocale = new Locale.Builder().setLanguage("en").setRegion("GB")
				.build();
		
		System.out.println(gbLocale);
	}

}
