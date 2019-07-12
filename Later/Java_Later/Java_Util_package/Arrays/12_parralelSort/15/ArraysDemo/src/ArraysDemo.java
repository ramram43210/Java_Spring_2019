import java.util.Arrays;
import java.util.function.Consumer;

/**
 * 
 * public static <T extends Comparable<? super T>> void
 * parallelSort(T[] a)
 * 
 * Sorts the specified array of objects into ascending order,
 * according to the natural ordering of its elements. All elements in
 * the array must implement the Comparable interface. Furthermore, all
 * elements in the array must be mutually comparable (that is,
 * e1.compareTo(e2) must not throw a ClassCastException for any
 * elements e1 and e2 in the array).
 * 
 * The sorting algorithm is a parallel sort-merge that breaks the
 * array into sub-arrays that are themselves sorted and then merged.
 * 
 * Type Parameters:
 * 
 * T - the class of the objects to be sorted
 * 
 * Parameters:
 * 
 * a - the array to be sorted
 *
 */

public class ArraysDemo
{

	public static void main(String[] args)
	{
		User[] users = getUsers();
		Arrays.parallelSort(users);
		Consumer<User> printUser = u -> System.out
				.println(u.getName() + "-" + u.getAge());
		Arrays.stream(users).forEach(printUser);
	}

	public static User[] getUsers()
	{
		User[] users = new User[5];
		users[0] = new User("Ram", 25);
		users[1] = new User("Peter", 22);
		users[2] = new User("Mohan", 21);
		users[3] = new User("Suresh", 30);
		users[4] = new User("Arvind", 20);
		return users;
	}

}
