import java.util.UUID;

public class UUIDDemo2
{

	public static void main(String[] args)
	{

		/*
		 * Static factory to retrieve a type 4 (pseudo randomly
		 * generated) UUID. The UUID is generated using a
		 * cryptographically strong pseudo random number generator.
		 * 
		 * Returns:
		 * 
		 * A randomly generated UUID
		 */
		UUID uuid = UUID.randomUUID();

		System.out.println(uuid);

	}

}
