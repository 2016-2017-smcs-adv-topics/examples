package smcs.mergesort;

public class RandomList {
	
	/*
	 * Group 1: Gabe, Joey, Reid
	 * Group 2: Janelle, Steven, Carol
	 * Group 3: Amanda, Gillian, Sabin
	 */
	
	private ListNode head, tail;

	/**
	 * O(1)
	 * 
	 * @param other
	 * @postcondition This list is a duplicate of other, in that it shares the
	 *                same head and tail values
	 */
	public RandomList(RandomList other) {
		// TODO Group 1
	}

	/**
	 * O(n) (could be optimized to O(1))
	 * 
	 * @return The number of elements in this list
	 */
	public int size() {
		// TODO Group 2
		return 0;
	}

	/**
	 * O(n)
	 * 
	 * @param startOfSecondHalf
	 *            Index of the first element of the "split off" second half of
	 *            the list
	 * @return A new RandomList composed the elements of this list from
	 *         startOfSecondHalf to the end
	 * @postcondition List now ends at startOfSecondHalf-1
	 */
	public RandomList split(int startOfSecondHalf) {
		// TODO Group 3
		return null;
	}

	/**
	 * O(1)
	 * 
	 * @return whether or not the list is empty
	 */
	public boolean isEmpty() {
		// TODO Group 1
		return true;
	}

	/**
	 * O(1)
	 * 
	 * @precondition List is not empty
	 * @return Value of the first element of the list
	 */
	public int head() {
		// TODO Group 2
		return 0;
	}

	/**
	 * O(1)
	 * 
	 * @precondition List is not empty
	 * @return value of the head element of the list
	 * @postcondition Head of list advances to element after head
	 */
	public int pop() {
		// TODO Group 2
		return 0;
	}

	/**
	 * O(1)
	 * @param value The value to be added to this list
	 * @postcondition The value is added to the end of the list and tail now refers to this new value
	 */
	public void add(int value) {
		// TODO Group 1
	}

	/**
	 * @postcondition The list becomes empty; head and tail are null
	 */
	public void clear() {
		// TODO Group 3
	}
}
