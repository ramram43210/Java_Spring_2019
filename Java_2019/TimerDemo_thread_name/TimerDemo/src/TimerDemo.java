import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo
{
	public static void main(String[] args) throws InterruptedException
	{

		/*
		 * 
		 * Creates a new timer whose associated thread has the
		 * specified name. The associated thread does not run as a
		 * daemon.
		 * 
		 * Parameters:
		 * 
		 * name - the name of the associated thread
		 */
		Timer timer = new Timer("Reminder Timer");

		TimerTask reminderTimerTask = new ReminderTimerTask();

		timer.schedule(reminderTimerTask, 5000, 2000);
		System.out.println("Timer has schedule the reminderTimerTask...");

	}

}
