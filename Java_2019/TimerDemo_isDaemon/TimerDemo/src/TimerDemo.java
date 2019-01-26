import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo
{
	public static void main(String[] args) throws InterruptedException
	{

		/*
		 * 
		 * Creates a new timer whose associated thread may be
		 * specified to run as a daemon.
		 * 
		 * A daemon thread is called for if the timer will be used to
		 * schedule repeating "maintenance activities", which must be
		 * performed as long as the application is running, but should
		 * not prolong the lifetime of the application.
		 * 
		 * Parameters:
		 * 
		 * isDaemon - true if the associated thread should run as a
		 * daemon.
		 */
		Timer timer = new Timer(false);

		TimerTask reminderTimerTask = new ReminderTimerTask();

		timer.schedule(reminderTimerTask, 5000, 2000);
		System.out.println("Timer has schedule the reminderTimerTask...");

	}

}
