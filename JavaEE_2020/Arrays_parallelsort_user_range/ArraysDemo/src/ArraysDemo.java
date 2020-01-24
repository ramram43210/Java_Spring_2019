import java.util.Arrays;
import java.util.function.Consumer;

public class ArraysDemo
{

	public static void main(String[] args)
	{
		User[] users = getUsers();
		Arrays.parallelSort(users, 0, 3);
		Consumer<User> printUser = u -> System.out.println(u.getName() + "-" + u.getAge());
		Arrays.stream(users).forEach(printUser);
	}

	public static User[] getUsers()
	{
		User[] users = new User[5];
		users[0] = new User("Ram", 25);
		users[1] = new User("Peter", 22);
		users[2] = new User("Mohan", 45);
		users[3] = new User("Arjun", 20);
		users[4] = new User("Arvind", 30);
		return users;
	}

}
