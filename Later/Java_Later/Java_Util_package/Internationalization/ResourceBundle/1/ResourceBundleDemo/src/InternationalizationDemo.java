import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * If Application supports US Country and English language, then read
 * message from MessageBundle_en_US.properties file.
 * 
 * If Application supports France country and French language, then
 * read message from MessageBundle_fr_FR.properties file.
 */
public class InternationalizationDemo
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Language code:");
		String languageCode = sc.next();

		System.out.println("Enter Country code:");
		String countryCode = sc.next();

		sc.close();

		if (countryCode.equals("US") && languageCode.equals("en"))
		{
			/*
			 * Gets a resource bundle using the specified base name
			 * and locale
			 * 
			 * Parameters:
			 * 
			 * baseName - the base name of the resource bundle, a
			 * fully qualified class name
			 * 
			 * locale - the locale for which a resource bundle is
			 * desired
			 * 
			 * Returns:
			 * 
			 * a resource bundle for the given base name and locale
			 * 
			 */
			ResourceBundle bundle = ResourceBundle.getBundle("MessageBundle",
					Locale.US);

			System.out.println("Message in " + Locale.US + " = "
					+ bundle.getString("greeting"));
		}
		else if (countryCode.equals("FR") && languageCode.equals("fr"))
		{
			ResourceBundle bundle = ResourceBundle.getBundle("MessageBundle",
					Locale.US);
			Locale.setDefault(new Locale("fr", "FR"));

			bundle = ResourceBundle.getBundle("MessageBundle");
			System.out.println("Message in " + Locale.getDefault() + " = "
					+ bundle.getString("greeting"));
		}
		else
		{
			System.out.println(
					"Please enter proper countryCode and languageCode.");
		}

	}

}
