import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo
{
	public static void main(String[] args) throws InterruptedException
	{

		Timer timer = new Timer();

		TimerTask reminderTimerTask = new ReminderTimerTask();

		timer.schedule(reminderTimerTask, 5000, 2000);

		System.out.println("Timer has schedule the reminderTimerTask...");

		/*
		 * Returns:
		 * 
		 * the time at which the most recent execution of this task
		 * was scheduled to occur, in the format returned by
		 * Date.getTime(). The return value is undefined if the task
		 * has yet to commence its first execution.
		 */
		long scheduledExecutionTime = reminderTimerTask
				.scheduledExecutionTime();
		System.out.println(
				"scheduledExecutionTime = " + new Date(scheduledExecutionTime));

	}

}
