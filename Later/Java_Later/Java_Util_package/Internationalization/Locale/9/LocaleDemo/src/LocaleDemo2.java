import java.util.Locale;

public class LocaleDemo2
{

	public static void main(String[] args)
	{

		Locale usLocale = new Locale("en", "US");
		System.out.println(usLocale);
		
		Locale frLocale = new Locale("fr", "FR");
		System.out.println(frLocale);
	}

}
