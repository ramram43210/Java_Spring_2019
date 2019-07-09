import java.util.UUID;

public class UUIDDemo
{

	public static void main(String[] args)
	{

		UUID uuid = UUID
				.fromString("38400000-8cf0-11bd-b23e-10b96e4ef00d");

		/*
		 * The timestamp value associated with this UUID.
		 * 
		 * The 60 bit timestamp value is constructed from the
		 * time_low, time_mid, and time_hi fields of this UUID. The
		 * resulting timestamp is measured in 100-nanosecond units
		 * since midnight, October 15, 1582 UTC.
		 * 
		 * The timestamp value is only meaningful in a time-based
		 * UUID, which has version type 1. If this UUID is not a
		 * time-based UUID then this method throws
		 * UnsupportedOperationException.
		 * 
		 * Returns:
		 * 
		 * The timestamp of this UUID.
		 * 
		 */
		long timeStamp = uuid.timestamp();
		System.out.println("timeStamp = " + timeStamp);

		/*
		 * The variant number associated with this UUID. The variant
		 * number describes the layout of the UUID.
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
