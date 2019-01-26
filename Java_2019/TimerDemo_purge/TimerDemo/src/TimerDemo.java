import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo
{
	public static void main(String[] args) throws InterruptedException
	{
		TimerTask cleanUpTimerTask = new CleanUpTimerTask();
		Timer timer = new Timer();

		timer.scheduleAtFixedRate(cleanUpTimerTask, 3000, 1000);
		System.out.println("Timer has schedule the cleanUpTimerTask...");

		Thread.sleep(5000);

		System.out.println("Going to cancel...");
		timer.cancel();

		/*
		 * Removes all cancelled tasks from this timer's task queue.
		 * Calling this method has no effect on the behavior of the
		 * timer, but eliminates the references to the cancelled tasks
		 * from the queue. If there are no external references to
		 * these tasks, they become eligible for garbage collection.
		 *
		 * Most programs will have no need to call this method. It is
		 * designed for use by the rare application that cancels a
		 * large number of tasks.
		 *
		 * Returns:
		 *
		 * the number of tasks removed from the queue.
		 */
		System.out.println("purge value :" + timer.purge());
	}

}
