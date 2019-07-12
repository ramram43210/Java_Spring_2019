import java.util.Enumeration;
import java.util.ResourceBundle;
import java.util.StringTokenizer;

public class MessageBundle_fr_FR extends ResourceBundle
{
	private String keys = "Hello Goodbye";

	/*
	 * Gets an object for the given key from this resource bundle.
	 * Returns null if this resource bundle does not contain an object
	 * for the given key.
	 * 
	 * Parameters:
	 * 
	 * key - the key for the desired object
	 * 
	 * Returns: the object for the given key, or null
	 * 
	 */
	@Override
	public Object handleGetObject(String key)
	{
		if (key.equals("Hello"))
		{
			return "Bonjour Peter";
		}
		if (key.equals("Goodbye"))
		{
			return "Au revoir Steve";
		}

		return null;
	}
	
	@Override
	public Enumeration getKeys()
	{
		StringTokenizer keyTokenizer = new StringTokenizer(keys);

		return keyTokenizer;
	}
}
