package smcs.mergesort;

public class RandomList {

	/*
	 * Group 1: Gabe, Joey, Reid Group 2: Janelle, Steven, Carol Group 3:
	 * Amanda, Gillian, Sabin
	 */

	private ListNode head, tail;

	/**
	 * O(1)
	 * 
	 * @param other
	 * @postcondition This list is a duplicate of other, in that it shares the
	 *                same head and tail nodes
	 */
	public RandomList(RandomList other) {
		head = other.head;
		tail = other.tail;
	}

	/**
	 * O(n) (could be optimized to O(1))
	 * 
	 * @return The number of elements in this list
	 */
	public int size() {
		int i = 0;
		for (ListNode j = head; j != null; j = head.getNext()) {

			++i;

		}
		return i;
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
		RandomList second = new RandomList(this);
		ListNode finger = head;
		for (int i = 0; i < (startOfSecondHalf - 1) && finger == null; i++) {
			finger = finger.getNext(); // finger traverses to the tail of first
										// half
		}
		second.head = finger.getNext();
		if (second.head == null) {
			second.tail = null;
		} else {
			second.tail = tail;
		}

		this.tail = finger; // change current list to only the first half of
							// the list
		this.tail.setNext(null);

		return second;
	}

	/**
	 * O(1)
	 * 
	 * @return whether or not the list is empty
	 */
	public boolean isEmpty() {

		if (head == null && tail == null) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * O(1)
	 * 
	 * @precondition List is not empty
	 * @return Value of the first element of the list
	 */
	public int head() {
		assert(!isEmpty());
		return head.getValue();
	}

	/**
	 * O(1)
	 * 
	 * @precondition List is not empty
	 * @return value of the head element of the list
	 * @postcondition Head of list advances to element after head
	 */
	public int pop() {
		assert(!isEmpty());
		int value = head.getValue();
		if (head == tail) {
			tail = null;
		}
		head = head.getNext();
		return value;
	}

	private static void set(int x, int i) {
		// TODO Auto-generated method stub

	}

	/**
	 * @postcondition The list becomes empty; head and tail are null
	 */
	public void clear() {
		// TODO Group 3
		head = null;
		tail = null;
	}
}
