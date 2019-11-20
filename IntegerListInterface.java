import java.nio.BufferOverflowException;

interface IntegerListInterface {
	/* Adds an element to the list at location atIndex
	 * if the list is full then the method throws a BufferOverFlowException
	 * or else if the atIndex is not within list index bounds then a IndexOutOfBoundsException is thrown
	 */
	public void add(int atIndex, int element) throws IndexOutOfBoundsException,BufferOverflowException;

	/* Add an element to the list
	 * if the list is full a BufferOverFlow exception is thrown
	 */
	public void add(int element) throws BufferOverflowException;

	/* Clears the list
	 */
	public void clear();

	/* Checks if the list isEmpty or not
	 * returns true if the list empty or false otherwise	 
	 */
	public boolean isEmpty();

	/* Remove an element from location atIndex
	 * The method returns the value at the location
	 */
	public int remove(int atIndex) throws IndexOutOfBoundsException;

	/* Removes from this List all of the elements whose
	 * index is between fromIndex, inclusive and toIndex, exclusive. 
	 */
	public void removeRange(int fromIndex, int toIndex) throws IndexOutOfBoundsException, IllegalArgumentException;

	/* Sets element at location atIndex with the value element	  
	 */
	public void set(int atIndex, int element) throws IndexOutOfBoundsException;

	/* Gets the value of the element at location atIndex* 
	 */
	public int get(int atIndex) throws IndexOutOfBoundsException;
		
	/* Returns the number of elements in the list
	 */
	public int size();
}
