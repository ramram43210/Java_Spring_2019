import java.util.ResourceBundle;
import java.util.Set;

public class ResourceBundleDemo
{

	public static void main(String[] args)
	{

		ResourceBundle bundle = ResourceBundle.getBundle("MessageBundle");

		/*
		 * Returns a Set of all keys contained in this ResourceBundle
		 * and its parent bundles.
		 * 
		 * Returns:
		 * 
		 * a Set of all keys contained in this ResourceBundle and its
		 * parent bundles.
		 * 
		 */
		Set<String> keySet = bundle.keySet();

		for (String key : keySet)
		{
			String value = bundle.getString(key);
			System.out.println(key + " = " + value);
		}

	}

}
