import java.util.ResourceBundle;

public class ResourceBundleDemo
{

	public static void main(String[] args)
	{

		ResourceBundle bundle = ResourceBundle.getBundle("MessageBundle");

		/*
		 * Determines whether the given key is contained in this
		 * ResourceBundle or its parent bundles.
		 * 
		 * Parameters:
		 * 
		 * key - the resource key
		 * 
		 * Returns:
		 * 
		 * true if the given key is contained in this ResourceBundle
		 * or its parent bundles; false otherwise.
		 * 
		 */
		boolean result = bundle.containsKey("greeting");
		System.out.println(result);

	}

}
