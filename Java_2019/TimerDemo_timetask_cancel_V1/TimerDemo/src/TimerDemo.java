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

		Thread.sleep(10000);
		/*
		 * Cancels this timer task. If the task has been scheduled for
		 * one-time execution and has not yet run, or has not yet been
		 * scheduled, it will never run. If the task has been
		 * scheduled for repeated execution, it will never run again.
		 * (If the task is running when this call occurs, the task
		 * will run to completion, but will never run again.)
		 * 
		 * Returns:true if this task is scheduled for one-time
		 * execution and has not yet run, or this task is scheduled
		 * for repeated execution. Returns false if the task was
		 * scheduled for one-time execution and has already run, or if
		 * the task was never scheduled, or if the task was already
		 * cancelled
		 * 
		 */
		boolean value = reminderTimerTask.cancel();
		System.out.println(value);

	}

}
