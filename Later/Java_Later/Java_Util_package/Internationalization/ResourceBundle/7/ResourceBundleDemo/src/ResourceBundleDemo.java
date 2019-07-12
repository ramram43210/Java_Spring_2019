import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleDemo
{

	public static void main(String[] args)
	{

		ResourceBundle bundle = ResourceBundle.getBundle("MessageBundle");

		/*
		 * Returns the locale of this resource bundle. This method can
		 * be used after a call to getBundle() to determine whether
		 * the resource bundle returned really corresponds to the
		 * requested locale or is a fallback.
		 * 
		 * Returns:
		 * 
		 * the locale of this resource bundle
		 * 
		 */
		Locale locale = bundle.getLocale();
		System.out.println(locale);

	}

}
