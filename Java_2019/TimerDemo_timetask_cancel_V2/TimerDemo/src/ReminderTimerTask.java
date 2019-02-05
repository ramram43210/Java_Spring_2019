import java.util.TimerTask;

public class ReminderTimerTask extends TimerTask
{
	public void run()
	{
		System.out.println("Wake up...");
		
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
		boolean value = cancel();
		System.out.println(value);
		
		System.out.println("ReminderTimerTask is cancelled");

	}
}
