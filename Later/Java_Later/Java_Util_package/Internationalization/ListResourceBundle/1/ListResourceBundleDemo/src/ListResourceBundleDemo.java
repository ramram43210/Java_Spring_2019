import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

public class ListResourceBundleDemo
{

	public static void main(String[] args)
	{

		Locale usLocale = new Locale("en", "US");
		printKeysValues(usLocale);

		System.out.println();

		Locale frLocale = new Locale("fr", "FR");
		printKeysValues(frLocale);

	}

	private static void printKeysValues(Locale locale)
	{
		ResourceBundle rb = ResourceBundle.getBundle("MessageBundle", locale);

		Enumeration<String> en = rb.getKeys();
		while (en.hasMoreElements())
		{
			String key = en.nextElement();
			System.out
					.println(key + " = " + rb.getString(key));
		}
	}

}
