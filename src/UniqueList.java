
/**
 * Class checks for duplicate integers, and only adds them once
 * 
 * @author Diego Cifuentes
 * @version 1
 */
public class UniqueList extends IntegerList 
{

	/**
	 * Calls the parent constructor in order to create an empty list 
	 * with an initial capacity of MIN_CAPACITY. 
	 */
	public UniqueList() 
	{
		super();
	}
	
	/**
	 * Calls the parent constructor in order to create an empty array
	 * with the given capacity
	 * 
	 * @param capacity		The size the array needs to be set to
	 */
	public UniqueList(int capacity)
	{
		super(capacity);
	}
	
	/**
	 * Checks to see if the given integer is already in the list before it is added,
	 * if it is then it will throw and IllegalArgumentException with the given message
	 * 
	 * @param integer		The given integer to be checked if it is a duplicate, if not add to list.
	 * @throws IllegalArgumentException if the given integer is already in the list.
	 */
	public void add(int integer) 
	{
		int count = 0;
		int sameAs = 0;
	
		while(count < super.size())
		{
			if (super.get(count) == integer)
			{
				sameAs++;
			}
			count++;
		}
		if (sameAs > 0)
		{
			throw new IllegalArgumentException("The integer " 
					+ integer + " is already in the list.");
		}
		else
		{
			super.add(integer);
		}
		
	}
	
	//Help from Braden White
	/**
	 * Checks to see if the given integer is already in the list before it is inserted,
	 * if it is then it will throw and IllegalArgumentException with the given message
	 * 
	 * @param index			The position in the array where the integer will should be added.
	 * @param integer		The integer to be added.
	 * @throws IllegalArgumentException if the given integer is already in the list.
	 */
	public void insert(int index, int integer) 
	{
		int count = 0;
		int sameAs = 0;
	
		while(count < super.size())
		{
			if (super.get(count) == integer)
			{
				sameAs++;
			}
			count++;
		}
		if (sameAs > 0)
		{
			throw new IllegalArgumentException("The integer " 
					+ integer + " is already in the list.");
		}
		else
		{
			super.insert(index, integer);
		}
	}
}



