package smcs.sorting;

public class RandomListNode {
	private int value;
	RandomListNode next;
	
	/**
	 * @precondition initialCapacity >= 1
	 * @param initialCapacity
	 */
	public RandomListNode(int initialCapacity) {
		assert(initialCapacity >= 1);
		value = initialCapacity;
		if (initialCapacity > 1) {
			next = new RandomListNode(initialCapacity - 1);
		}
	}
}
