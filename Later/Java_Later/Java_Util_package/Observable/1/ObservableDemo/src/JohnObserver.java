import java.util.Observable;
import java.util.Observer;

public class JohnObserver implements Observer
{

	@Override
	public void update(Observable o, Object arg)
	{
		System.out.println("JohnObserver is notified, Price changed to " + arg);

	}

}
