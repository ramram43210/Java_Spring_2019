import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo
{
	public static void main(String[] args) throws InterruptedException
	{
		TimerTask cleanUpTimerTask = new CleanUpTimerTask();
		Timer timer = new Timer();
		
		timer.scheduleAtFixedRate(cleanUpTimerTask,3000, 2000);
		System.out.println("Timer has schedule the cleanUpTimerTask...");

		Thread.sleep(6000);

		System.out.println("Going to cancel...");
		/*
		 * Terminates this timer, discarding any currently scheduled
		 * tasks. Does not interfere with a currently executing task
		 * (if it exists). Once a timer has been terminated, its
		 * execution thread terminates gracefully, and no more tasks
		 * may be scheduled on it.
		 */
		timer.cancel();
		System.out.println("Canceled...");
	}

}
