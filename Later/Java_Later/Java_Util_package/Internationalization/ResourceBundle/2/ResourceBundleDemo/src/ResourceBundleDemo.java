import java.util.Locale;
import java.util.ResourceBundle;

/**
 * If Application supports US Country and English language, then read
 * message from MessageBundle_en_US.properties file.
 * 
 * If Application supports France country and French language, then
 * read message from MessageBundle_fr_FR.properties file.
 */
public class ResourceBundleDemo
{

	public static void main(String[] args)
	{

		/*
		 * Gets a resource bundle using the specified base name, the
		 * default locale.
		 * 
		 * Parameters:
		 * 
		 * baseName - the base name of the resource bundle, a fully
		 * qualified class name
		 * 
		 * Returns:
		 * 
		 * a resource bundle for the given base name and the default
		 * locale
		 * 
		 */
		System.out.println("Default Locale = " + Locale.getDefault());
		ResourceBundle bundle = ResourceBundle.getBundle("MessageBundle");

		System.out.println("Message in " + Locale.US + " = "
				+ bundle.getString("greeting"));
		
		Locale.setDefault(new Locale("fr", "FR"));
		System.out.println("Default Locale = " + Locale.getDefault());

		bundle = ResourceBundle.getBundle("MessageBundle");
		System.out.println("Message in " + Locale.getDefault() + " = "
				+ bundle.getString("greeting"));

	}

}
