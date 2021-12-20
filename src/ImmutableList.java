
/**
 * This class creates objects that cannot be modified after that are created.
 * 
 * @author Diego Cifuentes
 * @version 1
 */
public class ImmutableList extends IntegerList 
{

	/**
	 * Calls the parent constructor in order to create an empty list 
	 * with an initial capacity of MIN_CAPACITY.
	 */
	public ImmutableList() 
	{
		super();
	}
	
	/**
	 * Calls the parent constructor in order to create a list, 
	 * with the given values in the form of an array. 
	 * 
	 * @param list		int... list is used to create an array of int's, in order to add as many values as needed
	 */
	public ImmutableList(int... list)
	{
		super();
		int count = 0;
		while (count < list.length)
		{
			super.insert(count, list[count]);
			count++;
		}
	}
	
	/**
	 * Mutator method is overriden by throwing an UnSupportedOperationException.
	 * 
	 * @throws UnsupportedOperationException
	 */
	public void add(int integer)
	{
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Mutator method is overriden by throwing an UnSupportedOperationException.
	 * 
	 * @throws UnsupportedOperationException
	 */
	public void insert(int index, int integer)
	{
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Mutator method is overriden by throwing an UnSupportedOperationException.
	 * 
	 * @throws UnsupportedOperationException
	 */
	public int remove(int index)
	{
		throw new UnsupportedOperationException();
	}

}
