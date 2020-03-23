import java.util.UUID;

public class UUIDDemo
{

	public static void main(String[] args)
	{

		UUID uuid = UUID.fromString("38400000-8cf0-11bd-b23e-10b96e4ef00d");

		/*
		 * 
		 * The clock sequence value associated with this UUID.
		 * 
		 * The 14 bit clock sequence value is constructed from the clock sequence field of
		 * this UUID. The clock sequence field is used to guarantee temporal uniqueness in
		 * a time-based UUID.
		 * 
		 * The clockSequence value is only meaningful in a time-based UUID, which has
		 * version type 1. If this UUID is not a time-based UUID then this method throws
		 * UnsupportedOperationException. Returns:The clock sequence of this UUID Returns:
		 * 
		 * Returns: The clock sequence value associated with this UUID.
		 */

		int clockSequence = uuid.clockSequence();
		System.out.println("clockSequence = " + clockSequence);
	}

}
