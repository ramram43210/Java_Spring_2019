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

	}

}
