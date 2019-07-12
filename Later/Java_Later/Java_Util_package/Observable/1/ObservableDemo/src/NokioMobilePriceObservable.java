import java.util.Observable;

public class NokioMobilePriceObservable extends Observable
{
	private int price;

	public NokioMobilePriceObservable(int price)
	{
		this.price = price;
	}

	public void setPrice(int newPrice)
	{

		/*
		 * if price has changed notify observers
		 */
		if (price != newPrice)
		{
			System.out.println("price changed to new price =  " + newPrice);
			price = newPrice;

			/*
			 * Marks this Observable object as having been changed;
			 * the hasChanged method will now return true.
			 */
			setChanged();

			/*
			 * If this object has changed, as indicated by the
			 * hasChanged method, then notify all of its observers and
			 * then call the clearChanged method to indicate that this
			 * object has no longer changed.
			 * 
			 * Each observer has its update method called with two
			 * arguments: this observable object and the arg argument.
			 * 
			 * Parameters:
			 * 
			 * arg - any object.
			 * 
			 */
			notifyObservers(newPrice);
		}

	}

}
