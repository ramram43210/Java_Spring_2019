import java.util.Locale;

public class LocaleDemo3
{

	public static void main(String[] args)
	{
		Locale usLocale = Locale.forLanguageTag("en-US");
		System.out.println(usLocale);
		
		Locale frLocale = Locale.forLanguageTag("fr_FR");
		System.out.println(frLocale);
	}

}
