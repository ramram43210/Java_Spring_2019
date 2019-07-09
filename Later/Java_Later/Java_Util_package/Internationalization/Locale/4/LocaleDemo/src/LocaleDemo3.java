import java.util.Locale;

public class LocaleDemo3
{

	public static void main(String[] args)
	{

		/*
		 * Returns: 
		 * 
		 * An array of ISO 639 two-letter language codes.
		 */
		String[] languageCodeArray = Locale.getISOLanguages();

		for (String language : languageCodeArray)
		{
			System.out.println(language);
		}
	}

}
