import java.util.UUID;

public class UUIDDemo3
{

	public static void main(String[] args)
	{

		byte[] byteArray = { 20, 40, 60 };

		/*
		 * Static factory to retrieve a type 3 (name based) UUID based
		 * on the specified byte array.
		 * 
		 * Parameters:
		 * 
		 * name - A byte array to be used to construct a UUID
		 * 
		 * Returns:
		 * 
		 * A UUID generated from the specified array
		 */
		UUID uuid = UUID.nameUUIDFromBytes(byteArray);

		// checking UUID value
		System.out.println(uuid);

	}

}
