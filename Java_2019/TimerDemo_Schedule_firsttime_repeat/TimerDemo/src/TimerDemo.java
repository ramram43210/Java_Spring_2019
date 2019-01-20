import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo
{
	public static void main(String[] args)
	{
		TimerTask cleanUpTimerTask = new CleanUpTimerTask();
		Timer timer = new Timer();

		Date firstTime = new Date(System.currentTimeMillis() + 5000);
		System.out.println("firstTime = " + firstTime);

		/*
		 * Schedules the specified task for repeated fixed-delay
		 * execution, beginning at the specified time.
		 *
		 * Parameters:
		 *
		 * task - task to be scheduled.
		 *
		 * firstTime - First time at which task is to be executed.
		 *
		 * period - time in milliseconds between successive task
		 * executions.
		 */
		timer.schedule(cleanUpTimerTask, firstTime, 2000);
		System.out.println("Timer has schedule the cleanUpTimerTask...");
	}

}
