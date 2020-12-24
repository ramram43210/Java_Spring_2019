import java.util.Enumeration;
import java.util.ResourceBundle;

public class ResourceBundleDemo
{

	public static void main(String[] args)
	{

		ResourceBundle bundle = ResourceBundle.getBundle("MessageBundle");

		/*
		 * Returns an enumeration of the keys.
		 * 
		 * Returns:
		 * 
		 * an Enumeration of the keys contained in this ResourceBundle
		 * and its parent bundles.
		 */
		Enumeration<String> enumerationOfKeys = bundle.getKeys();

		/*
		 * Print all the keys and corresponding values
		 */
		while (enumerationOfKeys.hasMoreElements())
		{
			String key = enumerationOfKeys.nextElement();
			String value = bundle.getString(key);
			System.out.println(key+" = "+value);
		}

	}

}
