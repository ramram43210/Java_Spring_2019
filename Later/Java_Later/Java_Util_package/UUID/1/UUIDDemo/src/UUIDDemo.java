import java.util.UUID;

public class UUIDDemo
{

	public static void main(String[] args)
	{

		/*
		 * Constructs a new UUID using the specified data. mostSigBits
		 * is used for the most significant 64 bits of the UUID and
		 * leastSigBits becomes the least significant 64 bits of the
		 * UUID.
		 * 
		 * Parameters:
		 * 
		 * mostSigBits - The most significant bits of the UUID
		 * 
		 * leastSigBits - The least significant bits of the UUID
		 */
		UUID uuid = new UUID(9999999L, 898989778L);
		System.out.println(uuid);

	}

}
