import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;

public class ArraysDemo
{
	public static void main(String[] args)
	{
		User[] userArray = getUsers();

		Comparator<User> ageComparator = Comparator.comparing(User::getAge);

		System.out.println("--Sort complete array--");
		Arrays.parallelSort(userArray, 0, 3, ageComparator);

		Consumer<User> printUser = u -> System.out.println(u.getName() + "-" + u.getAge());

		Arrays.stream(userArray).forEach(printUser);
	}

	public static User[] getUsers()
	{
		User[] userArray = new User[5];
		userArray[0] = new User("Ram", 25);
		userArray[1] = new User("Peter", 22);
		userArray[2] = new User("Mohan", 21);
		userArray[3] = new User("Suresh", 12);
		userArray[4] = new User("Arvind", 10);
		return userArray;
	}

}
