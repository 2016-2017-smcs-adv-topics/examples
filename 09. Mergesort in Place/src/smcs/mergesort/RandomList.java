package smcs.mergesort;

public class RandomList {

	private ListNode head, tail;

	/**
	 * O(n)
	 */
	public RandomList(int size) {
		for (int i = 0; i < size; i++) {
			add((int) (Math.random() * 100));
		}
	}

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
		int size = 0;
		for (ListNode finger = head; finger != null; finger = finger.getNext()) {
			++size;
		}
		return size;
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
		for (int i = 0; i < (startOfSecondHalf - 1) && finger != null; i++) {
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
		assert (!isEmpty());
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
		assert (!isEmpty());
		int value = head.getValue();
		if (head == tail) {
			tail = null;
		}
		head = head.getNext();
		return value;
	}

	/**
	 * O(1)
	 * 
	 * @param value
	 *            The value to be added to this list
	 * @postcondition The value is added to the end of the list and tail now
	 *                refers to this new value
	 */
	public void add(int value) {
		if (isEmpty()) {
			head = new ListNode(value);
			tail = head;
		} else {
			tail.setNext(new ListNode(value));
			tail = tail.getNext();
		}
	}

	/**
	 * @postcondition The list becomes empty; head and tail are null
	 */
	public void clear() {
		head = null;
		tail = null;
	}

	/**
	 * O(n)
	 * 
	 * @return String representation of the list
	 */
	public String toString() {
		ListNode finger = head;
		String result = "";
		while (finger != null) {
			result = result + finger.getValue() + " → ";
			finger = finger.getNext();
		}
		return result + "⋅";
	}
}
