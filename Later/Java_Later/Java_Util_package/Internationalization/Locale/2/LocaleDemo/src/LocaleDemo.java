import java.util.Locale;

public class LocaleDemo
{

	public static void main(String[] args)
	{

		/*
		 * Returns:
		 * 
		 * the default locale for this instance of the Java Virtual
		 * Machine
		 */
		Locale locale = Locale.getDefault();
		System.out.println("locale = " + locale);

		System.out.println("DisplayCountry = " + locale.getDisplayCountry());
		System.out.println("DisplayLanguage = " + locale.getDisplayLanguage());
		System.out.println("DisplayName = " + locale.getDisplayName());
		System.out.println("ISO3Country = " + locale.getISO3Country());
		System.out.println("ISO3Language = " + locale.getISO3Language());
		System.out.println("Language = " + locale.getLanguage());
		System.out.println("Country = " + locale.getCountry());

	}

}
