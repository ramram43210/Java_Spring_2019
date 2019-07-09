import java.util.UUID;

public class UUIDDemo1
{

	public static void main(String[] args)
	{

		/*
		 * Creates a UUID from the string standard representation
		 * 
		 * Parameters:
		 * 
		 * name - A string that specifies a UUID
		 * 
		 * Returns:
		 * 
		 * A UUID with the specified value
		 */
		UUID uuid = UUID
				.fromString("90400000-8cf0-11bd-b23e-10b96e4ef00d");
		
		System.out.println(uuid);

	}

}
