import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo
{
	public static void main(String[] args) throws InterruptedException
	{

		Timer timer = new Timer();
		TimerTask cleanUpTask = new CleanUpTask();
		TimerTask emailTask = new EmailTask();

		/*
		 * One time execution
		 */
		timer.schedule(emailTask, 3000);
		
		/*
		 * Repeated execution
		 */
		timer.schedule(cleanUpTask, 5000, 2000);

		System.out.println("Timer has schedule the tasks...");

	}

}
