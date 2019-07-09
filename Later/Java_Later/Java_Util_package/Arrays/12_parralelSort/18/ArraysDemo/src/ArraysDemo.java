import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;

/**
 * 
 * public static <T> void parallelSort(T[] a, int fromIndex, int
 * 										toIndex, Comparator<? super T> cmp)
 * 
 * Sorts the specified array of objects according to the order induced
 * by the specified comparator. All elements in the array must be
 * mutually comparable by the specified comparator (that is,
 * c.compare(e1, e2) must not throw a ClassCastException for any
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
 * fromIndex - the index of the first element (inclusive) to be sorted
 * 
 * toIndex - the index of the last element (exclusive) to be sorted
 * 
 * cmp - the comparator to determine the order of the array. A null
 * value indicates that the elements' natural ordering should be used.
 *
 */

public class ArraysDemo
{

	public static void main(String[] args)
	{
		User[] users = getUsers();
		Comparator<User> ageComparator = Comparator.comparing(User::getAge);

		Arrays.parallelSort(users, 0, 3, ageComparator);

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
