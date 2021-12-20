
/**
 * Class has a specified upper bound, and then appends all prime numbers that are less than
 * or equal to the given value that are not duplicates.
 * 
 * @author Diego Cifuentes
 * @version 1
 */
public class PrimeList extends IntegerList 
{
	
	/** First prime */
	private static final int FIRST_PRIME = 2;
	
	/**
	 * Calls the parent constructor in order to create an empty array 
	 * with the initial set capacity
	 */
	public PrimeList() 
	{
		super();
	}
	
	//Help from Braden White
	/**
	 * Constructs a list that contains all of the prime numbers that 
	 * are less than or equal to the given upperBound in an ascending order.
	 * Checks to see if the upperBound is negative, if so an IllegalArgumentException
	 * with a given message is thrown
	 * 
	 * @param upperBound		Used to check if the integer is valid
	 * @throws IllegalArgumentException if the upperBound is not positive
	 */
	public PrimeList(int upperBound)
	{
		if (upperBound <= 0)
		{
			throw new IllegalArgumentException("The upper "
					+ "bound must be positive.");
		}
		
		if (upperBound >= 2)
		{
			super.insert(0, FIRST_PRIME);
		}
		
		for(int num = 3; num <= upperBound; num++)
		{
			boolean isAPrime = true;
			
			for(int i = 2; i <= (num/2); i++)
			{
				if (num % i == 0)
				{
					isAPrime = false;
					break;
				}
			}
			
			if(isAPrime == true)
			{
				super.insert(super.size(), num);
			}
		}
	}
	
	/**
	 * Adds all the prime numbers that are greater than the last prime in the list
	 * and less than or equal to the given upperBound in an ascending order.
	 * If the list is empty and the upperBound is less than FIRST_PRIME, or 
	 * if the upperBiound is less than or equal to the last prime 
	 * in the list, if either is true, than will
	 * throw an IllegalArgumentException with a given message, 
	 * 
	 * @param upperBound		Used to check if the integer is valid
	 * @throws IllegalArgumentException if list is empty and the upperBound is less than FIRST_PRIME
	 * @throws IllegalArgumentException if the upperBound is less than or equal to the last prime in the list
	 */
	public void add(int upperBound)
	{
		if(super.size() == 0 && upperBound < FIRST_PRIME)
		{
			throw new IllegalArgumentException("The upper bound cannot "
					+ "be less than 2.");
		}
		
		if(super.size() > 0)
		{
			if(super.get(super.size() - 1) >= upperBound)
			{
				throw new IllegalArgumentException("The upper bound must be greater "
						+ "than the last prime in the list: " + super.get(super.size() - 1) + ".");
			}
		}
		
		//Help from Ethan Ho
		int lastNum = 1;
		if(super.size() > 0)
		{
			lastNum = super.get(super.size() - 1);
		}
		
		for(int num = lastNum + 1; num <= upperBound; num++)
		{
			boolean isAPrime = true;
			for(int i = 2; i <= (num/2); i++)
			{
				if (num % i == 0)
				{
					isAPrime = false;
					break;
				}
			}
			if(isAPrime == true)
			{
				super.insert(super.size(), num);
			}
		}
	}
	
	/**
	 * Method is disabled by throwing an UnsupportedOperationException.
	 * 
	 * @throws UnsupportedOperationException
	 */
	public void insert(int index, int integer) 
	{
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Removes all of the integers from the list whose indices 
	 * are greater than or equal to the given index and returns all of the numbers removed.
	 * If index is out of bounds, than throws an IndexOutOfBoundsException.
	 * 
	 * @param index		Index to be compared
	 * @throws IndexOutOfBoundsException if index is out of bounds
	 * @return Numbers removed
	 */
	public int remove(int index)
	{
		if (index < 0 || index >= super.size()) 
		{
			String message = "The index is outside the range [0, "
					+ (super.size() - 1) + "].";
			throw new IndexOutOfBoundsException(message);
		}
		
		//Help from Jack Davis
		int numRemoved = super.size() - index;
		
		for (int i = 0; i < numRemoved; i++)
		{
			super.remove(size() - 1);
		}
		
		return numRemoved; 
	}
}
