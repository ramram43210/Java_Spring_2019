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

		/*
		 * Returns the number of observers of this Observable object.
		 * 
		 * Returns:
		 * 
		 * the number of observers of this object.
		 */
		int count = nokioMobilePriceObservable.countObservers();
		System.out.println(count + " observers are listening");

		nokioMobilePriceObservable.setPrice(9000);

		System.out.println("------------------------------------------");

		/*
		 * Deletes an observer from the set of observers of this
		 * object.
		 * 
		 * Parameters:
		 * 
		 * o - the observer to be deleted.
		 */
		nokioMobilePriceObservable.deleteObserver(peterObserver);

		count = nokioMobilePriceObservable.countObservers();
		System.out.println(count + " observer is listening");
		nokioMobilePriceObservable.setPrice(20000);

		System.out.println("------------------------------------------");

		/*
		 * Clears the observer list so that this object no longer has
		 * any observers.
		 */
		nokioMobilePriceObservable.deleteObservers();
		count = nokioMobilePriceObservable.countObservers();
		System.out.println(count + " observers are listening");

		nokioMobilePriceObservable.setPrice(30000);

		

	}

}
