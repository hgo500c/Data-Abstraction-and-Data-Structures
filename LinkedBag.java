
public class LinkedBag implements BagInterface<String> {

	private Node head;
	private int size;
	
	/*
	 * Constructs an empty bag by initializing head node.
	 * Initialize size to zero.
	 */
	public LinkedBag() {
	}
		
	/*
	 * Returns the current size of the bag. You can return the value of size. 
	 */
	
	@Override
	public int getCurrentSize() {
		// write appropriate statements
		return 0;
	}

	/*
	 * Checks whether the bag is empty and returns true/false
	 */
	
	@Override
	public boolean isEmpty() {
		// write appropriate statements
		return true;
	}

	/*
	 * Adds a new node to the start, because it's more efficient.
	 * Wraps a new node around the data.  Then we make that new node
	 * the head of the list, first pointing it to the old head.
	 */
	@Override
	public boolean add(String newEntry) {
		
		// As long as there is memory remaining in the computer, this method should always succeed.
		return true;	
	}

	/*
	 * Since it's a bag, the programmer is free to choose which element to remove and return.
	 * So, since we want to be efficient programmers, we will remove the first node by advancing
	 * the head.
	 * Note the special case: if the bag is empty, return null.
	 */
	@Override
	public String remove() {
		return null;
	}

	/*
	 * You don't have to do the following (you can use the approach from last lab) but here is an idea:
	 * THE EASIEST NODE TO REMOVE IS THE FIRST NODE.  So, here is the algorithm:
	 * 1. Find the first occurrence of the string you want to remove.
	 * 2. COPY THE DATA from the first node to the node you found in step 1.
	 * 3. Remove the FIRST node.
	 * "But won't this mess up the order? Yes. But order doesn't matter. It's a bag."
	 * "Isn't it cheating to just copy the data? No. It's not cheating. It's clever."
	 */
	@Override
	public boolean remove(String anEntry) {
		return false;
	}

	/*
	 * Just set the head to null (and the size to 0).
	 * "But won't this leave a bunch of nodes hanging around in memory?  No.  As soon
	 *  as we stop pointing to the first node, it will get marked as garbage so that memory
	 *  can be cleaned up."
	 */
	@Override
	public void clear() {
	}

	// Returns a count of the number of items equal to anEntry
	@Override
	public int getFrequencyOf(String anEntry) {
		return 0;
	}

	// Returns whether or not anEntry appears in this bag
	@Override
	public boolean contains(String anEntry) {
		return false;
	}

	// Returns an array consisting of the elements in the bag
	// If there are no items, return an array of size 0. This method
	// should never return null.
	@Override
	public String[] toArray() {
		return null;
	}
	
	public String toString() {
		String result = "";
		Node current = head;
		while (current != null) {
			result = result + current.data + " ";
			current = current.next;
		}
		
		return result;
		
	}
	
	// A private inner class.  Notice that
	// the outer class can freely access its inner class, even 
	// though it's private.
	private class Node {
		private String data;
		private Node next;
		
		private Node(String data) {
			this.data = data;
		}
	}
	
	

}
