import java.util.Observable;
import java.util.Observer;

public class PeterObserver implements Observer
{

	@Override
	public void update(Observable observable, Object arg)
	{

		NokioMobilePriceObservable nokioMobilePriceObservable = (NokioMobilePriceObservable) observable;

		System.out.println("PeterObserver is notified, Price changed to "
				+ nokioMobilePriceObservable.getPrice());

	}

}
