import java.util.UUID;

public class UUIDDemo
{

	public static void main(String[] args)
	{

		UUID uuid = UUID
				.fromString("38400000-8cf0-11bd-b23e-10b96e4ef00d");

		/*
		 * The version number associated with this UUID. The version
		 * number describes how this UUID was generated. The version
		 * number has the following meaning: 
		 * 
		 * 1. Time-based UUID 
		 * 2. DCE security UUID 
		 * 3. Name-based UUID 
		 * 4. Randomly generated UUID
		 * 
		 * 
		 * Returns:
		 * 
		 * The timestamp of this UUID.
		 * 
		 */
		int version = uuid.version();
		System.out.println("version = " + version);

	}

}
