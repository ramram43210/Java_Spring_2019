import java.util.ListResourceBundle;

/**
 *
 * Subclasses of ListResourceBundle must override getContents and provide an array, where
 * each item in the array is a pair of objects. The first element of
 * each pair is the key, which must be a String, and the second
 * element is the value associated with that key.
 *
 */
public class MessageBundle_fr_FR extends ListResourceBundle
{
	/*
	 * Returns an array in which each item is a pair of objects in an
	 * Object array. The first element of each pair is the key, which
	 * must be a String, and the second element is the value
	 * associated with that key. See the class description for
	 * details.
	 *
	 * Returns:
	 *
	 * an array of an Object array representing a key-value pair.
	 */

	@Override
	protected Object[][] getContents()
	{
		return new Object[][] {
				{ "hello", "Bonjour Peter" },
				{ "welcome", "Bienvenue Juli" },
		};
	}

}
