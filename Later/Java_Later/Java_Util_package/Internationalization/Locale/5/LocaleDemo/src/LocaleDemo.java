import java.util.Locale;

public class LocaleDemo
{

	public static void main(String[] args)
	{
		Locale locale = Locale.getDefault();

		System.out.println("Locale = " + locale);

		Locale frLocale = new Locale("fr", "FR");

		/*
		 * Parameters:
		 * 
		 * newLocale - the new default locale
		 * 
		 */
		Locale.setDefault(frLocale);

		locale = Locale.getDefault();

		System.out.println("Locale = " + locale);

	}

}
