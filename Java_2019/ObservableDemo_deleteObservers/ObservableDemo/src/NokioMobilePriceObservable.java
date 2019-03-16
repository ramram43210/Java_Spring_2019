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

			System.out.println("Before Notify call hasChanged method");
			
			/*
			 * Returns:
			 * 
			 * true if and only if the setChanged method has been
			 * called more recently than the clearChanged method on
			 * this object; false otherwise.
			 * 
			 */
			if (this.hasChanged())
			{
				System.out.println("Price value changed");
			}
			else
			{
				System.out.println("Price value not changed");
			}

			/*
			 * If this object has changed, as indicated by the
			 * hasChanged method, then notify all of its observers and
			 * then call the clearChanged method to indicate that this
			 * object has no longer changed. Each observer has its
			 * update method called with two arguments: this
			 * observable object and null. In other words, this method
			 * is equivalent to:
			 * 
			 * notifyObservers(null)
			 * 
			 */
			notifyObservers();
			
			
			System.out.println("After Notify call hasChanged method");
			if (this.hasChanged())
			{
				System.out.println("Price value changed");
			}
			else
			{
				System.out.println("Price value not changed");
			}
		}

	}

	public int getPrice()
	{
		return price;
	}

}
