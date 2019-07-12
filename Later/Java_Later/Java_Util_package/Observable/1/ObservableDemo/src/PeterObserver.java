import java.util.Observable;
import java.util.Observer;

public class PeterObserver implements Observer
{

	@Override
	public void update(Observable o, Object arg)
	{
		System.out
				.println("PeterObserver is notified, Price changed to " + arg);

	}

}
