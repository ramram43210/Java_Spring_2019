import java.util.UUID;

public class UUIDDemo
{

	public static void main(String[] args)
	{

		UUID uuid = new UUID(9999999L, 898989778L);

		/*
		 * Returns the most significant 64 bits of this UUID's 128 bit
		 * value.
		 */
		long mostSignificantBits = uuid.getMostSignificantBits();
		System.out.println(
				"mostSignificantBits = " + mostSignificantBits);

		/*
		 * Returns the least significant 64 bits of this UUID's 128
		 * bit value.
		 */
		long leastSignificantBits = uuid.getLeastSignificantBits();

		System.out.println(
				"leastSignificantBits = " + leastSignificantBits);

	}

}
