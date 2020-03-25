import java.util.UUID;

public class UUIDDemo
{

	public static void main(String[] args)
	{

		UUID uuid = UUID.fromString("38400000-8cf0-11bd-b23e-10b96e4ef00d");

		/*
		 * The variant number associated with this UUID. The variant number describes the
		 * layout of the UUID.
		 * 
		 * Returns:
		 * 
		 * The variant number of this UUID
		 * 
		 */
		int variant = uuid.variant();
		System.out.println("variant = " + variant);

	}

}
