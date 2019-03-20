public class ObservableDemo
{

	public static void main(String[] args)
	{
		NokioMobilePriceObservable nokioMobilePriceObservable = new NokioMobilePriceObservable(
				6000);

		PeterObserver peterObserver = new PeterObserver();
		JohnObserver johnObserver = new JohnObserver();

		/*
		 * Adds an observer to the set of observers for this object,
		 * provided that it is not the same as some observer already
		 * in the set. The order in which notifications will be
		 * delivered to multiple observers is not specified.
		 * 
		 * Parameters:
		 * 
		 * o - an observer to be added.
		 * 
		 */
		nokioMobilePriceObservable.addObserver(peterObserver);
		nokioMobilePriceObservable.addObserver(johnObserver);

		nokioMobilePriceObservable.setPrice(9000);

	}

}
