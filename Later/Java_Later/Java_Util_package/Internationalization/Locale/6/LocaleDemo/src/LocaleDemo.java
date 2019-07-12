import java.util.Locale;

public class LocaleDemo
{

	public static void main(String[] args)
	{
		Locale locale = new Locale("en", "US", "WIN");

		System.out.println("Locale = " + locale);

		/*
		 * Returns:
		 * 
		 * The variant code, or the empty string if none is defined.
		 * 
		 */
		String variant = locale.getVariant();
		System.out.println("variant = " + variant);

		/*
		 * Returns:
		 * 
		 * The name of the display variant code appropriate to the
		 * locale.
		 */
		String displayVariant = locale.getDisplayVariant();
		System.out.println("displayVariant = " + displayVariant);

	}

}
