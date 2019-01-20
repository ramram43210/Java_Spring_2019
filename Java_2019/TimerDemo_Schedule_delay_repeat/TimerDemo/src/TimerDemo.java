import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo
{
	public static void main(String[] args)
	{
		TimerTask cleanUpTimerTask = new CleanUpTimerTask();
		Timer timer = new Timer();

		/*
		 * Schedules the specified task for execution after the
		 * specified delay.
		 *
		 * Parameters:
		 *
		 * task - task to be scheduled.
		 *
		 * delay - delay in milliseconds before task is to be
		 * executed.
		 *
		 * period - time in milliseconds between successive task
		 * executions.
		 */
		timer.schedule(cleanUpTimerTask, 5000, 2000);
		System.out.println("Timer has schedule the cleanUpTimerTask...");
	}

}
