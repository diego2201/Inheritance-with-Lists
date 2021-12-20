
/**
 * This class adds integers to the list in an ascending order.
 * 
 * @author Diego Cifuentes
 * @version 1
 */
public class SortedList extends IntegerList 
{
	
	/**
	 * Calls the parent constructor in order to create an empty array 
	 * with the initial set capacity
	 */
	public SortedList() 
	{
		super();
	}
	
	/**
	 * Calls the parent constructor in order to create an empty array
	 * with the given capacity
	 *  
	 * @param capacity		The size the array needs to be set to
	 */
	public SortedList(int capacity)
	{
		super(capacity);
	}
	
	//Help from Office Hours 
	/**
	 * Inserts the given integer to the list
	 * 
	 * @param integer	The integer to be added	
	 */
	public void add(int integer)
	{
		for(int i = super.size(); i > 0; i--)
		{
			if(super.get(i - 1) < integer) 
			{
				super.insert(i, integer);
				return;
			}
		}
		super.insert(0, integer);
	}
	
	/**
	 *  Mutator method is overriden by throwing an UnSupportedOperationException.
	 *  This is done in order to prevent the user from inserting integers at random positions
	 *  
	 *  @throws UnsupportedOperationException
	 */
	public void insert(int index, int integer) 
	{
		throw new UnsupportedOperationException();
	}

}
