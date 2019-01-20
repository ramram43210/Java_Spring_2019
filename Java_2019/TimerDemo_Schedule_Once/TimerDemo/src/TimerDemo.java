import java.util.Timer;

public class TimerDemo
{
	public static void main(String[] args)
	{
		CleanUpTimerTask cleanUpTimerTask = new CleanUpTimerTask();
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
		 */
		timer.schedule(cleanUpTimerTask, 5000);
		System.out.println("Timer has schedule the myTimerTask...");
	}

}
