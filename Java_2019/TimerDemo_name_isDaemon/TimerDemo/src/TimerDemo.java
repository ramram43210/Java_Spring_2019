import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo
{
	public static void main(String[] args) throws InterruptedException
	{

		/*
		 * 
		 * Creates a new timer whose associated thread has the
		 * specified name, and may be specified to run as a daemon.
		 * 
		 * Parameters:
		 * 
		 * name - the name of the associated thread
		 * 
		 * isDaemon - true if the associated thread should run as a
		 * daemon
		 * 
		 */
		Timer timer = new Timer("Reminder Timer", true);

		TimerTask reminderTimerTask = new ReminderTimerTask();

		timer.schedule(reminderTimerTask, new Date());
		System.out.println("Timer has schedule the reminderTimerTask...");

	}

}
